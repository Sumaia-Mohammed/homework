import java.util.*;

public class Ex7 {
    public static void main(String[] args) {
     Set<Integer> numbers = new TreeSet<>();
     numbers.add(5);
     numbers.add(6);
     numbers.add(2);
     numbers.add(9);

        System.out.println(descending(numbers));
    }

    public static Set<Integer> descending (Set<Integer>numbers){
       Set<Integer> result = new TreeSet<>(Comparator.reverseOrder());
       for (int n : numbers){
           result.add(n);
       }
       return result;
    }

}


