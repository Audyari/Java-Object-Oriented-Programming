package ProblemSolving.programmer.audy.aplication;

import ProblemSolving.programmer.audy.data.dataClass;

/**
 * InnertestAkses2
 */
class InnertestAkses2 extends dataClass {

    public InnertestAkses2(String name, int price) {
        super(name, price);
        
    }

    public static void main(String[] args) {
        dataClass test = new dataClass("ASEP", 1110);
        System.out.println(test.name);
    }
    
}


public class testAkses2 {
    public static void main(String[] args) {
       
        dataClass testAccess = new dataClass("Audy", 20000);
        
        
        System.out.println(testAccess.name);
    }
}
