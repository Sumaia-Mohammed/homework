package lesson13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {


        Robot robot = new Robot(1, "Robot1", "Blue", 20);
        Robot sameRobot = new Robot(1, "Robot1", "Blue", 20);

        System.out.println(robot.equals(sameRobot));

        Student student1 = new Student("Sumaia", "Mohammed", 24,"java");
        Student student2 = new Student("Sumaia", "Mohammed", 22,"java" );
        Student student3 = new Student("Emy" , "saif", 31,"java");



        System.out.println(student1.equals(student2)&&student1.equals(student3));

        Set<Student> allStudent = new HashSet<>();
        allStudent.add(student1);
        allStudent.add(student2);
        allStudent.add(student3);

        System.out.println(allStudent.size());

        HashMap<Student, Integer> studentsScore = new HashMap<>();

        studentsScore.put(student1, 10);
        studentsScore.put(student2, 20);
        studentsScore.put(student3, 30);

        System.out.println( studentsScore.get(student1));
       // System.out.println( studentsScore.merge(student1,10,));

        HashMap<Student, Integer> studentsScore2 = new HashMap<>();

        studentsScore2.put(student1, 100);
        studentsScore2.put(student2, 20);
        studentsScore2.put(student3, 30);

        studentsScore.putAll(studentsScore2);
        System.out.println(studentsScore.get(student1));
       // System.out.println(studentsScore.values());

        for (Student s : studentsScore.keySet()){
            System.out.println(s.firstName+": "+studentsScore.get(s));
        }

        int sum = 0;
        for (int i : studentsScore.values()){
            sum+=i;
        }
        System.out.println(sum/allStudent.size());


        /*
        double totalScores = 0;
        for(Map.Entry<Student, Integer> entry: studentsScore.entrySet()) {
            totalScores += entry.getValue();
        }
        System.out.println(totalScores/studentsScore.size());
*/



    }


}
