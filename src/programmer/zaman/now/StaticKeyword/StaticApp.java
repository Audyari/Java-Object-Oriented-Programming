package programmer.zaman.now.StaticKeyword;

import static programmer.zaman.now.StaticKeyword.Application.PROCESSORS;
import static programmer.zaman.now.StaticKeyword.Constant.*;

public class StaticApp {



    public static void main(String[] args) {

        System.out.println(APPLICATION);

        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(PROCESSORS);

        System.out.println("Komputer Memiliki "+  PROCESSORS + " CORE");
    }
}
