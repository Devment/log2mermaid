package studio.devment.log2mermaid;

import org.slf4j.ILoggerFactory;

/**
 * Factory to instantiate a new Mermaid logger.
 */
public class MermaidLoggerFactory implements ILoggerFactory {

    /**
     * Creates and returns a `IMermaidLogger` implementation.
     *
     * @param s the logger context
     * @return a `IMermaidLogger` implementation.
     */
    @Override
    public IMermaidLogger getLogger(final String s) {
        return new MermaidLogger(s);
    }

    //@DISABLE java:S3740
    /**
     * Creates and returns a `IMermaidLogger` implementation.
     *
     * @param clazz the logger context
     * @return a `IMermaidLogger` implementation.
     */
    public static IMermaidLogger getLogger(final Class clazz) {
        return new MermaidLogger(clazz);
    }
}
