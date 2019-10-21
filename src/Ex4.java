import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex4 {
    public static void main(String[] args) {
        Set<Integer> group1 = new HashSet<>();
        group1.add(1);
        group1.add(2);
        group1.add(3);
        group1.add(4);
        System.out.println(group1);

        Set<Integer> group2 = new HashSet<>();
        group2.add(5);
        group2.add(6);
        group2.add(2);
        group2.add(1);
        System.out.println(group2);

        //System.out.println(group1.containsAll(group2));

        System.out.println(intersection(group1,group2));
        System.out.println(union(group1,group2));
        System.out.println(difference(group1,group2));
        System.out.println(symetricDifference(group1,group2));




    }

    public static Set<Integer> intersection(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>result = new TreeSet<>();
        for (int a: set1){
            if (set2.contains(a)){
                result.add(a);
            }

        }
        return result;

    }

    public static Set<Integer> union(Set<Integer>set1,Set<Integer>set2){
        Set<Integer>result = new TreeSet<>();
        if (set1.addAll(set2)){
            result.addAll(set1);
        }
        return result;
    }

    public static Set<Integer> difference(Set<Integer>set1,Set<Integer>set2) {
        Set<Integer> result = new TreeSet<>();
        if (set1.retainAll(set2)) {
            result.addAll(set1);
        }
        return result;
    }

    public static Set<Integer> symetricDifference(Set<Integer>set1,Set<Integer>set2) {///?
        Set<Integer> result = new TreeSet<>();
         for (int n: set2) {
            if (set1.contains(n)) {
                set1.remove(n);
            }
             result.addAll(set1);
         }
        return result;
    }



}

// for (int n: set2) {
//            if (set1.contains(n)) {
//                set1.remove(n);
//            }
//            result.addAll(set1);
//        }
