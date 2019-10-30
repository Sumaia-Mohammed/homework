package lesson18;

import java.util.Random;

public class Ex3 extends Exception {
    public Ex3(String message) {
        super(message);
    }

    public static String get(String[] array) {
        Random generator = new Random();
        int intRandomNum = generator.nextInt(array.length);
        return array[intRandomNum];
    }
}
