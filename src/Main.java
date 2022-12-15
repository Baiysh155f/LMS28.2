import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 23, 6, 0, 12, 123, 6, 5, 1, 99, 3, 4, 1, 2);
        System.out.println("Элементтердин суммасы : " +
                list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum());

        System.out.println("Элементтердин среднее арифметическое числосу : " +
                list.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average());

        System.out.println("Кайталанганын саны : " + list.stream().filter(x -> x == x).count());
    }
}