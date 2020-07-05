package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlaceHolders {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(PlaceHolders.class);
        Integer age = 35;
        logger.info("At the age of {} Vladimir got his first jog", age );
    }
}
