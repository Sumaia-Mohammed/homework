
public class Main {

    public static void main(String[] args) {

        Teacher teacherAlina = new Teacher("Alina Denisenko",30, "Female"," Java 2");

        teacherAlina.name = "Alina Denisenko";

        teacherAlina.age = 30;

        teacherAlina.gender = " Female";

        teacherAlina.course = "Java 2";


        teacherAlina.introduce();



        Student studentHarry = new Student("Harry Potter");

        Student badStudent = new Student("Voland");



        studentHarry.introduce();


        badStudent.introduce();



        studentHarry.helpAnotherStudent(badStudent);



        Lesson oopLesson1 = new Lesson("OOP Introduction");

        Lesson oopLesson2 = new Lesson("OOP Objects & Classes", teacherAlina, 2);



        oopLesson2.printInfo();
        oopLesson2.students = new Student[]{studentHarry, badStudent};



        Homework harryHomeWork = studentHarry.doMyHomework();

        teacherAlina.check(harryHomeWork);

        System.out.println(harryHomeWork.score); //prints 80

        System.out.println(oopLesson2.students.length);

        for (Student s : oopLesson2.students){
            System.out.println(s.name);
        }
        // write code here
        //2
        //Harry poter
        // Voland

        Robot renatRobot = new Robot();//

        Robot h = new Robot("Bara","Black");///

        Robot robotRob = new Robot("robotRob","Yellow",10,"Green");
        Robot robotBot = new Robot("robotBot","Blue",8,"Black");

        Robot tedRobot = new Robot("Renato", "brown");
        Robot renatoRobot = new Robot();
        Robot robotBlue = new Robot("Blue");
        Robot robotYellow = new Robot("Yellow", "Green");

        Robot[] robots = new Robot[]{robotBot,robotBlue, robotRob, tedRobot, renatoRobot, robotYellow};

        robotRob.introduce();
        robotBot.introduce();

        renatRobot.introduce();

        h.introduce();


        for (Robot r : robots  ){
            if ("yellow".equalsIgnoreCase(r.color)) {
                r.introduce();
            }
        }
    }

}



class Teacher {

    String name;

    int age;

    String gender;

    String course;

    Teacher(String name, int age , String gender , String course) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;


    }


    void introduce() {

        System.out.println("Hello my name is " + name + ". I am teaching: " + course);

    }

    void check(Homework h){
        h.score = 80;
    }

}



class Student {



    String name;

    int averageScore;

    boolean alwaysAttendsClasses;


//cocekter
    Student(String name) {

        this.name = name;

    }



    void introduce() {

        System.out.println("Hey! My name is: " + this.name);

    }



    void helpAnotherStudent(Student student) {

        System.out.println(this.name + " helps " + student.name);

    }



    Homework doMyHomework() {

        Homework homework = new Homework("EASY");

        // do some coding

        homework.pushToGithub();

        return homework;

    }

}



class Lesson {

    String topic;

    boolean inEnglish = true;

    Teacher teacher;

    Student[] students;



    Lesson(String topic, Teacher teacher, int numberOfStudents) {

        this.topic = topic;

        this.teacher = teacher;

        this.students = new Student[numberOfStudents];

    }



    Lesson(String topic) {

        this.topic = topic;

    }



    void printInfo() {

        if (inEnglish) {

            System.out.println("This is lesson" + topic);

        } else {

            System.out.println("Другой язык");

        }

    }

}



class Homework {



    String difficulty;

    boolean isOnGitHub = false;

    int score;



    Homework(String difficulty) {

        this.difficulty = difficulty;

    }



    void pushToGithub() {

        // here we push to github

        this.isOnGitHub = true;

    }



}

class Robot {

    String name;
    String color;
    int weight;
    String eyecolor;

    Robot (){
        this.name= "Berlin";
    }

    Robot(String name,String color,int weight,String eyecolor   ){

        this.name = name;
        this.color = color;
        this.weight = weight;
        this.eyecolor = eyecolor;
    }

   // Robot() {
   //     this.name = "Berlin";
    //    this.color = "yellow";
  //  }


    Robot(String name) {
        this.name = name;
    }

    Robot(String name, String eyesColor) {
        this.name = name;
        this.eyecolor = eyesColor;
    }


    void introduce() {

        System.out.println("Hello, i am " +this.name +" i am " +this.color + " i wight " + this.weight + "kg " +"and have " + this.eyecolor + "eyes");

    }

}

