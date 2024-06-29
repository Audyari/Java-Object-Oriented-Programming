package programmer.zaman.now.GetterDanSetter;

public class Person {
    private int age;
    private String name;

    public boolean setAge(int newAge) {
        if (newAge >= 0) {
            this.age = newAge;
            return true;
        } else {
            return false;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }


    // Getter for name
    public String getName() {
        return name;
    }



}

