package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class PlaceHolders {
    public static void main(String[] args) {
//        Integer oldWeight;
//        Integer newWeight;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter old weight:");
//        oldWeight = scanner.nextInt();
//        System.out.println("Enter new weight:");
//        newWeight = scanner.nextInt();
//
//        Logger logger = LoggerFactory.getLogger(PlaceHolders.class);
//
//        logger.info("Old weight is {}. new weight is {}.", oldWeight, newWeight);
//        logger.info("After the program weight reduced is: " + (oldWeight - newWeight));

        String month = "August";
        String destination = "Software developer";
        String company = "T2Studio";

        Logger logger = LoggerFactory.getLogger(PlaceHolders.class);
        logger.info("At the month of {} Vladimir got his first job as a {} at {}", month, destination, company);
    }
}
