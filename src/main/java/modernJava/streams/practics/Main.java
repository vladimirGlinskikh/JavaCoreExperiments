package modernJava.streams.practics;

import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader vladimir = new Trader("Vladimir", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transactional> transactions = Arrays.asList(
                new Transactional(brian, 2011, 300),
                new Transactional(raoul, 2012, 1_000),
                new Transactional(raoul, 2011, 400),
                new Transactional(mario, 2012, 710),
                new Transactional(mario, 2012, 700),
                new Transactional(alan, 2012, 950),
                new Transactional(vladimir, 2011, 1_100));

        findAllTransactionsFor2011YearAndSortedThemByAmountFromSmallToLarge(transactions)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        listOfNonRepeatableCitiesWhereTradersWork(transactions)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        findAllTradersFromCambridgeAndSortedThem(transactions)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        System.out.println(returnedAStringWithAllTradersNamesSortedAlphabetically(transactions));
        System.out.println("------------------------------------");

        isThereEvenOneTraderFromMilan(transactions);
        System.out.println("------------------------------------");

        outputAmountsOfAllTransactionsOfTradersFromCambridge(transactions)
                .forEach(System.out::println);
        System.out.println("------------------------------------");

        maxAmountAmongAllTransactions(transactions);
        System.out.println("------------------------------------");

        minAmountAmongAllTransactions(transactions);
    }

    private static void minAmountAmongAllTransactions(List<Transactional> transactions) {
        transactions.stream()
                .min(comparing(Transactional::getValue))
                .ifPresent(transactional -> System.out.println(transactional.getValue()));
    }

    private static void maxAmountAmongAllTransactions(List<Transactional> transactions) {
        transactions.stream()
                .max(comparing(Transactional::getValue))
                .ifPresent(transactional -> System.out.println(transactional.getValue()));
    }

    private static List<Integer> outputAmountsOfAllTransactionsOfTradersFromCambridge(List<Transactional> transactions) {
        return transactions.stream()
                .filter(transactional -> transactional.getTrader().getCity().equals("Cambridge"))
                .map(Transactional::getValue)
                .collect(toList());
    }

    private static void isThereEvenOneTraderFromMilan(List<Transactional> transactions) {
        transactions.stream()
                .filter(transactional -> transactional.getTrader().getCity().equals("Milan"))
                .findAny()
                .ifPresent(transactional -> System.out.println(transactional.getTrader().getName()));

//                .anyMatch(transactional -> transactional.getTrader().getCity().equals("Milan"));
    }

    private static String returnedAStringWithAllTradersNamesSortedAlphabetically(List<Transactional> transactions) {
        return transactions.stream()
                .map(transactional -> transactional.getTrader().getName())
                .distinct()
                .sorted()
                .collect(joining(" "));
    }

    private static List<Trader> findAllTradersFromCambridgeAndSortedThem(List<Transactional> transactions) {
        return transactions.stream()
                .map(Transactional::getTrader)
                .filter(transactional -> transactional.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());
    }

    private static List<String> listOfNonRepeatableCitiesWhereTradersWork(List<Transactional> transactions) {
        return transactions.stream()
                .map(transactional -> transactional.getTrader().getCity())
                .distinct()
                .collect(toList());
    }

    private static List<Transactional> findAllTransactionsFor2011YearAndSortedThemByAmountFromSmallToLarge(List<Transactional> transaction) {
        return transaction.stream()
                .filter(transactional -> transactional.getYear() == 2011)
                .sorted(comparing(Transactional::getValue))
                .collect(toList());
    }
}
