import java.nio.charset.Charset
import kotlin.math.log

plugins {
    id("java")
    id("groovy")
}

group = "studio.devment"
version = "0.1-SNAPSHOT"

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



abstract class CreateFileTask : DefaultTask() {
    @Input
    val fileText = "HELLO FROM MY TASK"

    @Input
    val fileName = "myfile"

    @Input
    val logFile = "log/tests.log"

    @OutputFile
    val myFile: File = File("$fileName.mermaid")

    @TaskAction
    fun action() {
        // Read log file
        val logFile = File(logFile)
        val lines = logFile.reader(Charset.defaultCharset()).readLines()

        var mermaidLines = "sequenceDiagram" + System.lineSeparator()

        for (line in lines) {
            val index = line.indexOf("mermaid -> ")
            if(index != -1){
                mermaidLines += line.substring(index + 11) + System.lineSeparator()
            }
        }


        myFile.createNewFile()
        myFile.writeText(mermaidLines)
    }
}

tasks.register<CreateFileTask>("createFileTask", ) {
    group = "log2mermaid"
    description = "Create myFile.txt in the current directory"
}



