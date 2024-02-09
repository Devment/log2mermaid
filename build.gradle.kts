plugins {
    id 'java'
    id 'groovy'
}

group = 'studio.devment'
version = '0.1-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.slf4j:slf4j-api:2.0.11'
    implementation 'ch.qos.logback:logback-classic:1.4.14'


    testImplementation platform('org.junit:junit-bom:5.9.1')
    testImplementation 'org.junit.jupiter:junit-jupiter'
    testImplementation 'org.spockframework:spock-core:2.3-groovy-3.0'
}

tasks.named('test') {
    useJUnitPlatform()
}

