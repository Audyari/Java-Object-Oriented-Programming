class Employee {

    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Halo dari Employe" + name + this.name);
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Halo dari Manager" + name + this.name);
    }
}

class VicePresident extends Employee {

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Halo dari VP " + name + this.name);
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Employee testObjek = new Employee("Audyari");
        // System.out.println(testObjek);

        // testObjek.sayHello("Audyari 1");

        // testObjek = new Manager("ASEP EMPLOYEE");
        // System.out.println(testObjek);

        // testObjek.sayHello("ASEPPPP");

        // testObjek = new VicePresident("ADIP VP");
        // System.out.println(testObjek);

        sayHello(new Employee(" SATU "));
        sayHello(new Manager(" DUA "));
        sayHello(new VicePresident(" TIGA "));

    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident dataEmployee = (VicePresident) employee;
            System.out.println("Halo VicePresident" + dataEmployee.name );
        } else if (employee instanceof Manager) {
            Manager dataManager = (Manager) employee;
            System.out.println("Halo Manager"+ dataManager.name);
        } else if (employee instanceof Employee) {
            Employee dataEmploye = (Employee) employee;
            System.out.println("Hallo Employe" + dataEmploye.name);
        }
    }
}


