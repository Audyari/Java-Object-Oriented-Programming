public class MyClass extends Object {
    private String name;

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyClass[name=" + name + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyClass) {
            MyClass other = (MyClass) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        MyClass obj1 = new MyClass("John");
        MyClass obj2 = new MyClass("John");

        System.out.println(obj1.toString()); // Output: MyClass[name=John]
        System.out.println(obj1.equals(obj2)); // Output: true
        System.out.println(obj1.hashCode() == obj2.hashCode()); // Output: true

        System.out.println(obj1.getClass());
        System.out.println(obj1.hashCode());

    }
}