public class PolymorphismApp {
    public static void main(String[] args) {


        Employee employee = new Employee("Audy");
        employee.sayHello("Audy Emploi");

        employee = new Manager("Audy2");
        employee.sayHello("Audy Manager");

        employee = new VicePresident("Audy3");
        employee.sayHello("Audy VP");

        sayHello(new Employee("Audy Employee"));
        sayHello(new Manager("Audy Manager"));
        sayHello(new VicePresident("Audy VP"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
