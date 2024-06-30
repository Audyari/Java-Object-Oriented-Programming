package programmer.zaman.now.EnumClass;

public class Example {

    public static void main(String[] args) {
        DayOfWeek today = DayOfWeek.TUESDAY;
        System.out.println("Today is " + today);

        if (today == DayOfWeek.MONDAY) {
            System.out.println("It's the start of the week!");
        } else if (today == DayOfWeek.TUESDAY) {
            System.out.println("It's the start of the week! TUESDAY");
        }

        // Cek Jumlah Value Enum
        Integer numElements = DayOfWeek.values().length;
        System.out.println(numElements);

        // Print the enum values
        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }
    }
}

