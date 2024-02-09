package studio.devment.log2mermaid

import spock.lang.Specification

class MermaidLoggerFactoryTest extends Specification {

    def "Test Constructor(String)"(){
        given:
        String s = "string"

        when:
        var LOGGER = (new MermaidLoggerFactory()).getLogger(s)

        then:
        noExceptionThrown()
    }


    def "Test Constructor(Class)"(){
        given:
        Class clazz = MermaidLoggerFactoryTest.class

        when:
        var LOGGER = (new MermaidLoggerFactory()).getLogger(clazz)

        then:
        noExceptionThrown()
    }
}
