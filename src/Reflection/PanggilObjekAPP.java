package Reflection;

public class PanggilObjekAPP {

    public static void main(String[] args) {
        testPrototypeAPP panggilObjk = new testPrototypeAPP();

        panggilObjk.name = null;
        panggilObjk.password = null;

        ValidationUtil.validationReflection(panggilObjk);

        System.out.println(panggilObjk.name);
    }
}
