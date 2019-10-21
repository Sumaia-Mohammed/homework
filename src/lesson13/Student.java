package lesson13;

import java.util.Objects;

public class Student {

    String firstName;
    String lastName;
    int age;
    String course;

    public Student (String firstName,String lastName , int age , String course ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.course = course;

    }


    public boolean equals(Object s) {
        Student anotherStudent = (Student) s;
        return firstName == anotherStudent.firstName &&
                lastName.equals(anotherStudent.lastName) &&
                age==(anotherStudent.age) &&
                course .equals(anotherStudent.course);
    }

    public int hashCode() {
        return firstName.hashCode() + lastName.hashCode() ;
    }




}


