package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JExample {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("SampleLogger");
        logger.info("slf4j in action, for example.");
    }
}
