package studio.devment.log2mermaid

import org.slf4j.Marker
import spock.lang.Specification

class MermaidLoggerTest extends Specification {

    IMermaidLogger LOGGER

    void setup() {
        LOGGER = MermaidLoggerFactory.getLogger(MermaidLoggerTest.class)
    }

    def "Mermaid Request"() {
        given:
        final var sender = "Client"
        final var receiver = "Server"
        final var alice = "Alice"
        final var bob = "Bob"

        when:
        LOGGER.addParticipant(sender)
        LOGGER.addActor(receiver)

        LOGGER.logRequest(sender, receiver, "request")
        LOGGER.logResponse(sender, receiver, "response")

        LOGGER.createActor(alice, "a")
        LOGGER.logRequest(sender, "a", "Message", MessageType.SOLID_LINE)
        LOGGER.destroyActor(alice)

        LOGGER.createParticipant(bob, "b")
        LOGGER.logRequest(sender, "b", "message", MessageType.DOTTED_LINE)

        then:
        noExceptionThrown()
    }









    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /// Tests to increase Code Coverage                                                                              ///
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    def "Test trace output"() {
        given: "A Logger an messages"
        final var s = "message {} {} {}"
        final var o = "object"
        final var o1 = "object1"
        final var throwable = new RuntimeException("exception")

        final var marker = Mock(Marker)

        when: "Messages are printed"
        LOGGER.trace(s)
        LOGGER.trace(s, o)
        LOGGER.trace(s, o, o1)
        LOGGER.trace(s, o, o, o, o, o)
        LOGGER.trace(s, throwable)

        LOGGER.trace(marker, s)
        LOGGER.trace(marker, s, o)
        LOGGER.trace(marker, s, o, o1)
        LOGGER.trace(marker, s, o, o, o, o, o)
        LOGGER.trace(marker, s, throwable)

        LOGGER.getName()

        then: "No error occur"
        LOGGER.isTraceEnabled()
        LOGGER.isTraceEnabled(marker)
        noExceptionThrown()

    }

    def "Test debug output"() {
        given: "A Logger an messages"
        final var s = "message {} {} {}"
        final var o = "object"
        final var o1 = "object1"
        final var throwable = new RuntimeException("exception")

        final var marker = Mock(Marker)

        when: "Messages are printed"
        LOGGER.debug(s)
        LOGGER.debug(s, o)
        LOGGER.debug(s, o, o1)
        LOGGER.debug(s, o, o, o, o, o)
        LOGGER.debug(s, throwable)

        LOGGER.debug(marker, s)
        LOGGER.debug(marker, s, o)
        LOGGER.debug(marker, s, o, o1)
        LOGGER.debug(marker, s, o, o, o, o, o)
        LOGGER.debug(marker, s, throwable)

        then: "No error occur"
        LOGGER.isDebugEnabled()
        LOGGER.isDebugEnabled(marker)
        noExceptionThrown()
    }

    def "Test info output"() {
        given: "A Logger an messages"
        final var s = "message {} {} {}"
        final var o = "object"
        final var o1 = "object1"
        final var throwable = new RuntimeException("exception")

        final var marker = Mock(Marker)

        when: "Messages are printed"
        LOGGER.info(s)
        LOGGER.info(s, o)
        LOGGER.info(s, o, o1)
        LOGGER.info(s, o, o, o, o, o)
        LOGGER.info(s, throwable)

        LOGGER.info(marker, s)
        LOGGER.info(marker, s, o)
        LOGGER.info(marker, s, o, o1)
        LOGGER.info(marker, s, o, o, o, o, o)
        LOGGER.info(marker, s, throwable)

        then: "No error occur"
        LOGGER.isInfoEnabled()
        LOGGER.isInfoEnabled(marker)
        noExceptionThrown()
    }

    def "Test warn output"() {
        given: "A Logger an messages"
        final var s = "message {} {} {}"
        final var o = "object"
        final var o1 = "object1"
        final var throwable = new RuntimeException("exception")

        final var marker = Mock(Marker)

        when: "Messages are printed"
        LOGGER.warn(s)
        LOGGER.warn(s, o)
        LOGGER.warn(s, o, o1)
        LOGGER.warn(s, o, o, o, o, o)
        LOGGER.warn(s, throwable)

        LOGGER.warn(marker, s)
        LOGGER.warn(marker, s, o)
        LOGGER.warn(marker, s, o, o1)
        LOGGER.warn(marker, s, o, o, o, o, o)
        LOGGER.warn(marker, s, throwable)

        then: "No error occur"
        LOGGER.isWarnEnabled()
        LOGGER.isWarnEnabled(marker)
        noExceptionThrown()
    }

    def "Test error output"() {
        given: "A Logger an messages"
        final var s = "message {} {} {}"
        final var o = "object"
        final var o1 = "object1"
        final var throwable = new RuntimeException("exception")

        final var marker = Mock(Marker)

        when: "Messages are printed"
        LOGGER.error(s)
        LOGGER.error(s, o)
        LOGGER.error(s, o, o1)
        LOGGER.error(s, o, o, o, o, o)
        LOGGER.error(s, throwable)

        LOGGER.error(marker, s)
        LOGGER.error(marker, s, o)
        LOGGER.error(marker, s, o, o1)
        LOGGER.error(marker, s, o, o, o, o, o)
        LOGGER.error(marker, s, throwable)

        then: "No error occur"
        LOGGER.isErrorEnabled()
        LOGGER.isErrorEnabled(marker)
        noExceptionThrown()
    }
}
