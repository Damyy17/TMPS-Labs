package Lab1.SRP;

public class Student {

    private final String name;
    private final String surname;
    private final int age;

    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void printDetails(){
        System.out.println("Details of the student are: " + "\n" +
                "Name : " + name + "\n" +
                "Surname : " + surname + "\n" +
                "Age : " + age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
