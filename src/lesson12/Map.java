package lesson12;

/*public class Map {
    private String name = "Rachel";
}*/

class Map {
    private static String name = "Rachel";

    static void foo() {
        System.out.println(name);
    }

    static void bar() {
        name = "Monica";
    }
}