package programmer.zaman.now.EqualsMethod;

import java.util.Objects;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return Objects.equals(name, other.name) && age == other.age;
    }

    public static void main(String[] args) {

        Person p1 = new Person("John", 30);
        Person p2 = new Person("John", 30);
        Person p3 = new Person("Jane", 25);

        System.out.println("p1 equals p2: " + p1.equals(p2)); // true
        System.out.println("p1 equals p3: " + p1.equals(p3)); // false

        // Membandingkan objek menggunakan ==
        System.out.println("p1 == p2: " + (p1 == p2)); // false
        System.out.println("p1 == p1: " + (p1 == p1)); // true


    }
}
