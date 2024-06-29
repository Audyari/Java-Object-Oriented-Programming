package programmer.zaman.now.HashCodeMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.age == other.age;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {

        // Membuat beberapa objek Person
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("Jane Smith", 25);
        Person person3 = new Person("John Doe", 30);

        // Mencetak nilai hash dari masing-masing objek
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

        // Menggunakan hashCode() dalam HashMap
        HashMap<Person, String> personMap = new HashMap<>();
        personMap.put(person1, "John Doe");
        personMap.put(person2, "Jane Smith");
        personMap.put(person3, "John Doe");

        System.out.println("\nData dalam HashMap:");
        for (Person p : personMap.keySet()) {
            System.out.println(personMap.get(p));
        }

        // Menggunakan hashCode() dalam HashSet
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);

        System.out.println("\nData dalam HashSet:");
        for (Person p : personSet) {
            System.out.println(p.getName() + ", " + p.getAge());
        }
    }

}
