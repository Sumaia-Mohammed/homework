package lesson17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose which operation you want to perform");
        System.out.println("1.Divide 3 by a number entered by the user (3/x).\n" +
                "2.Calculate the square root of a number provided by the user (√x)\n" +
                "3.Sum 5 to a number entered by the user(5+x).");
        String Input = scanner.nextLine();
        int x = Integer.parseInt(Input);

        try {
            System.out.println("Choose a number");
            String userInput = scanner.nextLine();
            int numberInput = Integer.parseInt(userInput);

            switch (x) {
                case 1:
                    System.out.println(3 / numberInput);
                    break;
                case 2:
                    System.out.println(Math.sqrt(numberInput));
                    if( numberInput <0){
                        throw new InputMismatchException("Only Positive Numbers!");
                       // throw new IllegalArgumentException("Only Positive Numbers!");
                    }
                    break;
                case 3:
                    System.out.println(5 + numberInput);
                    break;

            }

            FileInputStream inputStream = new FileInputStream(new File("/some/path" + numberInput));

        } catch (FileNotFoundException fnfE) {
            System.out.println("Some thing bad happened:" + fnfE.getMessage());

        } catch (NumberFormatException numberFormat) {
            System.out.println("Type a number!");

        } catch (ArithmeticException bZ) {
            System.out.println("It's not possible to divide by 0!" + bZ.getMessage());

        }catch (InputMismatchException e){
            System.out.println(e.getMessage());

        }/*catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }*/

    }
}
