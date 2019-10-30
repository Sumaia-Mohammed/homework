package lesson18;
import java.util.Scanner;

public class MainStudentProperties {
    public static void main(String[] args) throws StudentProperties {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the first name!");
        String firstName = scanner.nextLine();
        System.out.println("Give me the last name!");
        String lastName = scanner.nextLine();
        System.out.println("Give me the age!");
        Integer age = Integer.parseInt(scanner.nextLine());
        System.out.println("Give me the course!");
        String course = scanner.nextLine();

        try {
            if (firstName.length() < 3) {
                throw new StudentProperties("The first name should be below 3 characters ");
            }
            if (lastName.length() < 3) {
                throw new StudentProperties("The last name should be below 3 characters ");
            }
            if (age < 0) {
                throw new StudentProperties("The age  should be  less than zero");
            }

        }catch (StudentProperties e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println(firstName+" "+lastName+" "+age+" "+course);
    }
}
