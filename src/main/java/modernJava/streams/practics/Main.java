package modernJava.streams.practics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transactional> transactions = Arrays.asList(
                new Transactional(brian, 2011, 300),
                new Transactional(raoul, 2012, 1_000),
                new Transactional(raoul, 2011, 400),
                new Transactional(mario, 2012, 710),
                new Transactional(mario, 2012, 700),
                new Transactional(alan, 2012, 950));

        findAllTransactionsFor2011YearAndSortedThemByAmountFromSmallToLarge(transactions)
                .forEach(System.out::println);

        listOfNonRepeatableCitiesWhereTradersWork(transactions)
                .forEach(System.out::println);
    }

    private static List<String> listOfNonRepeatableCitiesWhereTradersWork(List<Transactional> transactions) {
        return transactions.stream()
                .map(transactional -> transactional.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
    }

    private static List<Transactional> findAllTransactionsFor2011YearAndSortedThemByAmountFromSmallToLarge(List<Transactional> transaction) {
        return transaction.stream()
                .filter(transactional -> transactional.getYear() == 2011)
                .sorted(Comparator.comparing(Transactional::getValue))
                .collect(Collectors.toList());
    }
}
