package lesson17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Integer.parseInt(input);

       /* List<String> list = new ArrayList<>();
        System.out.println(list.get(3));*/

      /*  try {

            FileInputStream inputStream = new FileInputStream(new File("/some/path" + Integer.parseInt(scanner.nextLine())));
            //        inputStream.close();

        }catch (FileNotFoundException e){//Throwable
            System.out.println("Oh noooo i'm so sad");
        }catch (NumberFormatException){
            System.out.println("Our user is not wise");
        }*/
///beshakel afdal

       /* try {
            String userInput = scanner.nextLine();
            int numberInput = Integer.parseInt(userInput);
            FileInputStream inputStream = new FileInputStream(new File("/some/path" + numberInput));

        }catch (FileNotFoundException fnfE){//Throwable
            System.out.println("Oh noooo i'm so sad");
            System.out.println(fnfE.getMessage());
          //  System.out.println(fnfE.getStackTrace());
            fnfE.getStackTrace();
            fnfE.printStackTrace();
        }catch (NumberFormatException numberFormat){
            System.out.println("Our user is not wise");
        }*/


        String userInput = scanner.nextLine();
        int numberInput = Integer.parseInt(userInput);
        try {
            FileInputStream inputStream = new FileInputStream(new File("/some/path"));

        }catch (FileNotFoundException fnfE){//Throwable
            System.out.println("Some thing bad happened:"+ fnfE.getMessage());

        }catch (NumberFormatException numberFormat){
            System.out.println("Our user is not wise");
        }


    }
}
