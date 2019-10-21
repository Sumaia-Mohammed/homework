import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> numbers = randomSet(5);

      //  numbers=randomSet(100);
        for (int k : numbers){
            System.out.println(k*2);

        }
        System.out.println(numbers);


        System.out.println(numbers.size());




    }
    public static Set<Integer> randomSet (int n){
        Set<Integer> result = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i<n;i++) {
            result.add(random.nextInt(100));


        }
        return result;
    }

}
