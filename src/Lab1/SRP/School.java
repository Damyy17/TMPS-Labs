package Lab1.SRP;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private final List<Student> students = new ArrayList<>();
//    private final List<Books> books = new ArrayList<>();

    //students
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student, " + student.getName() + ", was enrolled successfully!");
    }

    public void deleteStudentByName(String name){
        students.removeIf(student -> Objects.equals(student.getName(), name));
        System.out.println("Student, " + name + ", unfortunately was expelled :(");
    }

    public void printListOfStudents(){
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getSurname());
        }
    }

}
