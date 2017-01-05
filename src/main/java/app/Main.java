package app;


import org.apache.log4j.Logger;

/**
 * Created by Taras_Krysiuk on 11/29/2016.
 */
public class Main {

    public static void main(String[] args) {
        Logger LOG = Logger.getRootLogger();
        LOG.trace("Trace message.");
        LOG.debug("Debug message.");
        LOG.info("Info message.");
        LOG.warn("Warn message.");
        LOG.error("Error message.");
        LOG.fatal("Fatal message.");
    }

}
