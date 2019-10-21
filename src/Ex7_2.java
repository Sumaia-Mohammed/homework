import java.util.*;

public class Ex7_2 {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Comparator.reverseOrder());
        numbers.add(5);
        numbers.add(6);
        numbers.add(2);
        numbers.add(9);

        System.out.println(numbers);
    }
}


