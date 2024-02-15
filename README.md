# Log2Mermaid
Adds a new Logger implementation that is equal to the build in one but with methods to generate a Mermaid sequence diagram. Also adds a new gradle task to extract the Mermaid expressions from the log file and generate a png/svg out of it.

## Requirements
- Usage of gradle
- Usage of the slf4j as logging library

## How to use

Add this extension to your gradle project. Also add the slf4j library if not already added.
```groovy
repositories {
    maven {
        url = uri("https://maven.pkg.github.com/Devment/log2mermaid")
        credentials {
            username = project.findProperty("gpr.user") ?: System.getenv("USERNAME")
            password = project.findProperty("gpr.key") ?: System.getenv("TOKEN")
        }
    }
}

dependencies {
    implementation 'studio.devment:log2mermaid:0.1.0'
    implementation("org.slf4j:slf4j-api:2.0.11")
}
```
**build.gradle**

```java
class ExampleClass {
    private static final IMermaidLogger LOGGER = new MermaidLoggerFactory.getLogger(ExampleClass.class);
    
    public void sendRequest(final String message) {
        LOGGER.logRequest("Client", "Server", message);
        // ...
    }
}
```
**ExampleClass.java**