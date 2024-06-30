package programmer.zaman.now.RecordClass;

public class main {

    public static void main(String[] args) {
        // Membuat objek Student
        Student student1 = new Student("John Doe", 20, "Computer Science");
        Student student2 = new Student("Jane Doe", 21, "Information Technology");

        // Mengakses field-field
        System.out.println("Student 1:");
        System.out.println("Age: " + student1.age());
        System.out.println("Name: " + student1.name());
        System.out.println("Major: " + student1.major());

        System.out.println("\nStudent 2:");
        System.out.println("Name: " + student2.name());
        System.out.println("Age: " + student2.age());
        System.out.println("Major: " + student2.major());

        // Membandingkan dua objek Student
        System.out.println("\nAre they equal? " + student1.equals(student2)); // false

        // Mencetak hashCode
        System.out.println("\nStudent 1 hashCode: " + student1.hashCode());
        System.out.println("Student 2 hashCode: " + student2.hashCode());

        // Mencetak string representation
        System.out.println("\nStudent 1 toString: " + student1);
        System.out.println("Student 2 toString: " + student2);
    }
}
