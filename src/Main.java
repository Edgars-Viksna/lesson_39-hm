import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
//        Дан List<Integer>. Найти значение элемента, максимально близкого к
//        некоторому заданному значению N

        List<Integer> integerList = List.of(-3, -1, 0, 1, 3, 5);
        System.out.println(maxCloseTo(integerList, 7));
        System.out.println(maxCloseTo(integerList, 2));
        System.out.println(maxCloseTo(integerList, -4));

    }

    public static String maxCloseTo(List<Integer> list, Integer integer) {
        TreeSet<Integer> treeSet = new TreeSet<>(list);
        Integer result1 = treeSet.lower(integer);
        Integer result2 = treeSet.ceiling(integer);
        String toLower = result1 != null ? result1.toString() : "none";
        String toHigher = result2 != null ? result2.toString() : "none";
        return "closest elements to " + integer + " are: " + toLower + " and " + toHigher;

    }
}