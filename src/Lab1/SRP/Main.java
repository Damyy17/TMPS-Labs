package Lab1.SRP;

public class Main {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle");
        System.out.println();

        School school = new School();
        Library library = new Library();

        Student student1 = new Student("Josh", "Hence", 18);
        Student student2 = new Student("Christine", "Gustin", 16);
        Student student3 = new Student("Alex", "Smith", 17);

        school.addStudent(student1);
        school.addStudent(student2);
        school.deleteStudentByName("Josh");
        school.addStudent(student3);
        school.printListOfStudents();

        System.out.println();

        student3.printDetails();

        System.out.println();

        Books book1 = new Books("Alchemist", "Paulo Coelho", 208);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);
        library.addBookToLibrary(book1);

        System.out.println();

        library.printListOfBooks();

    }
}
