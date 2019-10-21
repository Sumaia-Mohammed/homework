import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainHash {
    public static void main(String[] args) {
        Set<String> fruet = new HashSet<>();
        fruet.add("banana");
        fruet.add("apple");
        fruet.add("orange");

        for (String s : fruet){
            System.out.println(s);
        }

        fruet.clear();
        System.out.println(fruet);

        fruet.add("grapes");
        System.out.println(fruet);

        if (fruet.isEmpty()){
            System.out.println("I am empty!");
        }else {
            System.out.println("I am not empty!");
        }


    }
}
