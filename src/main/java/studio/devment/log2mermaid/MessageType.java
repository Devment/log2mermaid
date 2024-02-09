package studio.devment.log2mermaid;

/**
 * Enum to define which arrow should be used for a request or response.
 */
public enum MessageType {

    /**
     * A solid line with no arrowhead.
     */
    SOLID_LINE("->"),

    /**
     * A dotted line with no arrowhead.
     */
    DOTTED_LINE("-->"),

    /**
     * A solid line with an arrowhead.
     */
    SOLID_ARROW("->>"),

    /**
     * A dotted line with an arrowhead.
     */
    DOTTED_ARROW("-->>"),

    /**
     * A solid line with a cross as arrowhead.
     */
    SOLID_CROSS("-x"),

    /**
     * A dotted line with a cross as arrowhead.
     */
    DOTTED_CROSS("--x"),

    /**
     * A solid line with an empty arrowhead. For async requests/responses.
     */
    SOLID_ARROW_ASYNC("-)"),

    /**
     * A dotted line with an empty arrowhead. For async requests/responses.
     */
    DOTTED_ARROW_ASYNC("--)");



    private final String arrow;

    MessageType(final String arrow) {
        this.arrow = arrow;
    }

    /**
     * @return the mermaid identifier for the needed arrow type.
     */
    String getArrow() {
        return arrow;
    }

}
