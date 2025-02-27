import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PruebaMaven {
	private static final Logger logger = LoggerFactory.getLogger(PruebaMaven.class);
    public static void main(String[] args) {

        logger.debug("Debug Hello world2!");
        logger.info("Info Hello world2!");
        logger.warn("Warn Hello world2!");
        logger.error("Error Hello world2!");
    }
}
