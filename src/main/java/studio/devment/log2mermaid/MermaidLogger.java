package studio.devment.log2mermaid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;

class MermaidLogger implements IMermaidLogger {

    private final Logger LOGGER;

    public MermaidLogger(final String s){
        LOGGER = LoggerFactory.getLogger(s);
    }

    public MermaidLogger(final Class clazz) {
        LOGGER = LoggerFactory.getLogger(clazz);
    }

    @Override
    public String getName() {
        return LOGGER.getName();
    }

    @Override
    public boolean isTraceEnabled() {
        return LOGGER.isTraceEnabled();
    }

    @Override
    public void trace(final String s) {
        LOGGER.trace(s);
    }

    @Override
    public void trace(final String s, final Object o) {
        LOGGER.trace(s, o);
    }

    @Override
    public void trace(final String s, final Object o, final Object o1) {
        LOGGER.trace(s, o, o1);
    }

    @Override
    public void trace(final String s, final Object... objects) {
        LOGGER.trace(s, objects);
    }

    @Override
    public void trace(final String s, final Throwable throwable) {
        LOGGER.trace(s, throwable);
    }

    @Override
    public boolean isTraceEnabled(final Marker marker) {
        return LOGGER.isTraceEnabled(marker);
    }

    @Override
    public void trace(final Marker marker, final String s) {
        LOGGER.trace(marker, s);
    }

    @Override
    public void trace(final Marker marker, final String s, final Object o) {
        LOGGER.trace(marker, s, o);
    }

    @Override
    public void trace(final Marker marker, final String s, final Object o, final Object o1) {
        LOGGER.trace(marker, s, o, o1);
    }

    @Override
    public void trace(final Marker marker, final String s, final Object... objects) {
        LOGGER.trace(marker, s, objects);
    }

    @Override
    public void trace(final Marker marker, final String s, final Throwable throwable) {
        LOGGER.trace(marker, s, throwable);
    }

    @Override
    public boolean isDebugEnabled() {
        return LOGGER.isDebugEnabled();
    }

    @Override
    public void debug(final String s) {
        LOGGER.debug(s);
    }

    @Override
    public void debug(final String s, final Object o) {
        LOGGER.debug(s, o);
    }

    @Override
    public void debug(final String s, final Object o, final Object o1) {
        LOGGER.debug(s, o, o1);
    }

    @Override
    public void debug(final String s, final Object... objects) {
        LOGGER.debug(s, objects);
    }

    @Override
    public void debug(final String s, final Throwable throwable) {
        LOGGER.debug(s, throwable);
    }

    @Override
    public boolean isDebugEnabled(final Marker marker) {
        return LOGGER.isDebugEnabled(marker);
    }

    @Override
    public void debug(final Marker marker, final String s) {
        LOGGER.debug(marker, s);
    }

    @Override
    public void debug(final Marker marker, final String s, final Object o) {
        LOGGER.debug(marker, s, o);
    }

    @Override
    public void debug(final Marker marker, final String s, final Object o, final Object o1) {
        LOGGER.debug(marker, s, o, o1);
    }

    @Override
    public void debug(final Marker marker, final String s, final Object... objects) {
        LOGGER.debug(marker, s, objects);
    }

    @Override
    public void debug(final Marker marker, final String s, final Throwable throwable) {
        LOGGER.debug(marker, s, throwable);
    }

    @Override
    public boolean isInfoEnabled() {
        return LOGGER.isInfoEnabled();
    }

    @Override
    public void info(final String s) {
        LOGGER.info(s);
    }

    @Override
    public void info(final String s, final Object o) {
        LOGGER.info(s, o);
    }

    @Override
    public void info(final String s, final Object o, final Object o1) {
        LOGGER.info(s, o, o1);
    }

    @Override
    public void info(final String s, final Object... objects) {
        LOGGER.info(s, objects);
    }

    @Override
    public void info(final String s, final Throwable throwable) {
        LOGGER.info(s, throwable);
    }

    @Override
    public boolean isInfoEnabled(final Marker marker) {
        return LOGGER.isInfoEnabled(marker);
    }

    @Override
    public void info(final Marker marker, final String s) {
        LOGGER.info(marker, s);
    }

    @Override
    public void info(final Marker marker, final String s, final Object o) {
        LOGGER.info(marker, s, o);
    }

    @Override
    public void info(final Marker marker, final String s, final Object o, final Object o1) {
        LOGGER.info(marker, s, o, o1);
    }

    @Override
    public void info(final Marker marker, final String s, final Object... objects) {
        LOGGER.info(marker, s, objects);
    }

    @Override
    public void info(final Marker marker, final String s, final Throwable throwable) {
        LOGGER.info(marker, s, throwable);
    }

    @Override
    public boolean isWarnEnabled() {
        return LOGGER.isWarnEnabled();
    }

    @Override
    public void warn(final String s) {
        LOGGER.warn(s);
    }

    @Override
    public void warn(final String s, final Object o) {
        LOGGER.warn(s, o);
    }

    @Override
    public void warn(final String s, final Object... objects) {
        LOGGER.warn(s, objects);
    }

    @Override
    public void warn(final String s, final Object o, final Object o1) {
        LOGGER.warn(s, o, o1);
    }

    @Override
    public void warn(final String s, final Throwable throwable) {
        LOGGER.warn(s, throwable);
    }

    @Override
    public boolean isWarnEnabled(final Marker marker) {
        return LOGGER.isWarnEnabled(marker);
    }

    @Override
    public void warn(final Marker marker, final String s) {
        LOGGER.warn(marker, s);
    }

    @Override
    public void warn(final Marker marker, final String s, final Object o) {
        LOGGER.warn(marker, s, o);
    }

    @Override
    public void warn(final Marker marker, final String s, final Object o, final Object o1) {
        LOGGER.warn(marker, s, o, o1);
    }

    @Override
    public void warn(final Marker marker, final String s, final Object... objects) {
        LOGGER.warn(marker, s, objects);
    }

    @Override
    public void warn(final Marker marker, final String s, final Throwable throwable) {
        LOGGER.warn(marker, s, throwable);
    }

    @Override
    public boolean isErrorEnabled() {
        return LOGGER.isErrorEnabled();
    }

    @Override
    public void error(final String s) {
        LOGGER.error(s);
    }

    @Override
    public void error(final String s, final Object o) {
        LOGGER.error(s, o);
    }

    @Override
    public void error(final String s, final Object o, final Object o1) {
        LOGGER.error(s, o, o1);
    }

    @Override
    public void error(final String s, final Object... objects) {
        LOGGER.error(s, objects);
    }

    @Override
    public void error(final String s, final Throwable throwable) {
        LOGGER.error(s, throwable);
    }

    @Override
    public boolean isErrorEnabled(final Marker marker) {
        return LOGGER.isErrorEnabled(marker);
    }

    @Override
    public void error(final Marker marker, final String s) {
        LOGGER.error(marker, s);
    }

    @Override
    public void error(final Marker marker, final String s, final Object o) {
        LOGGER.error(marker, s, o);
    }

    @Override
    public void error(final Marker marker, final String s, final Object o, final Object o1) {
        LOGGER.error(marker, s, o, o1);
    }

    @Override
    public void error(final Marker marker, final String s, final Object... objects) {
        LOGGER.error(marker, s, objects);
    }

    @Override
    public void error(final Marker marker, final String s, final Throwable throwable) {
        LOGGER.error(marker, s, throwable);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /// Mermaid Specific one                                                                                         ///
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private static final String MERMAID_IDENTIFIER = "mermaid ->";

    @Override
    public void addParticipant(final String participant) {
        LOGGER.debug("{} participant {}", MERMAID_IDENTIFIER, participant);
    }

    @Override
    public void addParticipant(final String participant, final String alias) {
        LOGGER.debug("{} participant {} as {}", MERMAID_IDENTIFIER, alias, participant);
    }

    @Override
    public void createParticipant(final String participant) {
        LOGGER.debug("{} create participant {}", MERMAID_IDENTIFIER, participant);
    }

    @Override
    public void createParticipant(final String participant, final String alias) {
        LOGGER.debug("{} create participant {} as {}", MERMAID_IDENTIFIER, alias, participant);
    }

    @Override
    public void destroyParticipant(final String participant) {
        LOGGER.debug("{} destroy {}", MERMAID_IDENTIFIER, participant);
    }

    @Override
    public void addActor(final String actor) {
        LOGGER.debug("{} actor {}", MERMAID_IDENTIFIER, actor);
    }

    @Override
    public void addActor(final String actor, final String alias) {
        LOGGER.debug("{} actor {} as {}", MERMAID_IDENTIFIER, alias, actor);
    }

    @Override
    public void createActor(final String actor) {
        LOGGER.debug("{} create actor {}", MERMAID_IDENTIFIER, actor);
    }

    @Override
    public void createActor(final String actor, final String alias) {
        LOGGER.debug("{} create actor {} as {}", MERMAID_IDENTIFIER, alias, actor);
    }

    @Override
    public void destroyActor(final String actor) {
        LOGGER.debug("{} destroy {}", MERMAID_IDENTIFIER, actor);
    }

    @Override
    public void createBox(final String groupName, final String color, final String... participants) {
        LOGGER.debug("{} box {} {}", MERMAID_IDENTIFIER, color, groupName);
        for(String participant : participants) {
            addParticipant(participant);
        }
    }

    @Override
    public void logRequest(final String sender, final String receiver, final String msg) {
        logRequest(sender, receiver, msg, MessageType.SOLID_ARROW);
    }

    @Override
    public void logRequest(final String sender, final String receiver, final String msg, final MessageType type) {
        LOGGER.debug("{} {}{}{}: {}", MERMAID_IDENTIFIER, sender, type.getArrow(),receiver, msg);
    }

    @Override
    public void logResponse(final String receiver, final String sender, final String msg) {
        logResponse(receiver, sender, msg, MessageType.SOLID_ARROW);
    }

    @Override
    public void logResponse(final String receiver, final String sender, final String msg, final MessageType type) {
        LOGGER.debug("{} {}{}{}: {}", MERMAID_IDENTIFIER, sender, type.getArrow(), receiver, msg);
    }

    @Override
    public void logNote(final String note, final String rightOf) {
        LOGGER.debug("{} Note right of {}: {}", MERMAID_IDENTIFIER, rightOf, note);
    }

    @Override
    public void logNote(final String note, final String overFirst, final String overSecond) {
        LOGGER.debug("{} Note over {},{}: {}", MERMAID_IDENTIFIER, overFirst, overSecond, note);
    }
}
