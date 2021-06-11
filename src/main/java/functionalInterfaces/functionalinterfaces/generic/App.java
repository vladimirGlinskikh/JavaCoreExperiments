package functionalInterfaces.functionalinterfaces.generic;

public class App {
    public static void main(String[] args) {
//        TwoArgsProcessor<Integer> multiplyInts = new TwoArgsProcessor<Integer>() {
//            @Override
//            public Integer process(Integer args1, Integer args2) {
//                return args1 * args2;
//            }
//        };
//
//        TwoArgsProcessor<Double> addDoubles = new TwoArgsProcessor<Double>() {
//            @Override
//            public Double process(Double args1, Double args2) {
//                return args1 + args2;
//            }
//        };
//
//        TwoArgsProcessor<String> compareStrings = new TwoArgsProcessor<String>() {
//            @Override
//            public String process(String args1, String args2) {
//                return args1.compareTo(args2) > 0 ? args1 : args2;
//            }
//        };

//        System.out.println(multiplyInts.process(2, 3));
//        System.out.println(addDoubles.process(4.1, 5.6));
//        System.out.println(compareStrings.process("One", "Two"));

        TwoIntsProcessor multiplyInts = new TwoIntsProcessor() {
            @Override
            public Integer process(Integer args1, Integer args2) {
                return args1 * args2;
            }
        };

        TwoIntsProcessor subtractInts = new TwoIntsProcessor() {
            @Override
            public Integer process(Integer args1, Integer args2) {
                return args1 - args2;
            }
        };

        TwoIntsProcessorAbstract divideInts = new TwoIntsProcessorAbstract() {
            @Override
            public Integer process(Integer args1, Integer args2) {
                return args1 / args2;
            }
        };

        System.out.println(multiplyInts.process(2, 3));
        System.out.println(subtractInts.process(5, 2));
        System.out.println(divideInts.process(10, 2));
    }
}
