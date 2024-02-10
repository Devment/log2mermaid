import java.awt.Desktop
import java.net.URI
import java.nio.charset.Charset

plugins {
    id("java")
    id("groovy")
    id("maven-publish")
}

group = "studio.devment"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.slf4j:slf4j-api:2.0.11")
    implementation("ch.qos.logback:logback-classic:1.4.14")


    testImplementation("org.spockframework:spock-core:2.3-groovy-3.0")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Devment/log2mermaid")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("USERNAME")
                password = project.findProperty("gpr.key") as String? ?: System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("gpr") {
            from(components["java"])
        }
    }
}



abstract class CreateFileTask : DefaultTask() {

    @Input
    val fileName = "code"

    @Input
    val logFile = "log/tests.log"

    @OutputFile
    val myFile: File = File("$fileName.mermaid")

    @TaskAction
    fun action() {
        // Read log file
        print("log2mermaid - Reading logfile '$logFile'.")
        val logFile = File(logFile)
        val lines = logFile.reader(Charset.defaultCharset()).readLines()

        var mermaidLines = "sequenceDiagram" + System.lineSeparator()

        for (line in lines) {
            val index = line.indexOf("mermaid -> ")
            if(index != -1){
                mermaidLines += line.substring(index + 11) + System.lineSeparator()
            }
        }

        // Write mermaid file
        print("log2mermaid - Writing mermaid '$myFile'.")
        myFile.createNewFile()
        myFile.writeText(mermaidLines)

        // Add mermaid code to html template
        print("log2mermaid - Writing html '$myFile.html'.")
        val prefix = "<!-- Copied from https://github.com/mermaid-js/mermaid-cli/blob/master/index.html -->\n" +
                "<!doctype html>\n" +
                "<html>\n" +
                "<body>\n" +
                "    <pre class=\"mermaid\">"

        val suffix = "    </pre>\n" +
                "    <script type=\"module\">\n" +
                "        // don't import minified CSS files (e.g. `*.min.css`), since that actually\n" +
                "        // makes the dist/index.html slightly larger!\n" +
                "        //import faBrands from \"@fortawesome/fontawesome-free/css/brands.css\"\n" +
                "        //import faRegular from \"@fortawesome/fontawesome-free/css/regular.css\"\n" +
                "        //import faSolid from \"@fortawesome/fontawesome-free/css/solid.css\"\n" +
                "        //import fontawesome from \"@fortawesome/fontawesome-free/css/fontawesome.css\"\n" +
                "\n" +
                "        import mermaid from \"https://cdn.jsdelivr.net/npm/mermaid@10/dist/mermaid.esm.min.mjs\";\n" +
                "        //import zenuml from \"@mermaid-js/mermaid-zenuml\"\n" +
                "\n" +
                "        mermaid.initialize({ startOnLoad: true });\n" +
                "    </script>\n" +
                "    </body>\n" +
                "</html>"

        val htmlFile = File("${myFile.name}.html")
        htmlFile.createNewFile()
        htmlFile.writeText(prefix + mermaidLines + suffix)

        // Open file in default browser
        val projectDir = project.projectDir.absolutePath.replace('\\', '/')
        val uri = URI("file://${projectDir}/$htmlFile")
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            print("log2mermaid - Opening file '$uri' in default browser.")
            Desktop.getDesktop().browse(uri)
        }
    }
}

tasks.register<CreateFileTask>("createFileTask") {
    group = "log2mermaid"
    description = "Create myFile.txt in the current directory"
}



