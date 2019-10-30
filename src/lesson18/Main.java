package lesson18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws InvalidPhoneNumberException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a Phone Number");
          String input = scanner.nextLine();

          try {
              if ( input.length() < 14) {
                  throw new InvalidPhoneNumberException("The phone number should be 14 number ");
              }

              if (input.charAt(0) != '+'){
                  throw new InvalidPhoneNumberException("Should start with + ");

              }
          }catch (InvalidPhoneNumberException e){
               //e.printStackTrace();
                  System.out.println(e.getMessage());
               }

                System.out.println(input);

    }
}
