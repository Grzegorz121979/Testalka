import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, Boolean> isPositive = i -> i > 0;
        Function<Integer, Boolean> isEvan = i -> i % 2 == 0;
        Function<Integer, Boolean> isTwoDigit = i -> Math.abs(i) > 9 && Math.abs(i) < 100;

        printResult(isPositive, 4);
        printResult(isEvan, 7);
        printResult(isTwoDigit, 45);

    }

    public static void printResult(Function<Integer, Boolean> function, Integer num) {
        System.out.println("Result: " + function.apply(num));
    }
}
