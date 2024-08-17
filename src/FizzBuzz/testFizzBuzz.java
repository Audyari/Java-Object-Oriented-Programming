package FizzBuzz;

public class testFizzBuzz {

    public static void main(String[] args) {
        testFIZZBUZZ(10);
    }


    static void testFIZZBUZZ(int Data){

        for (int i=1; i <= Data; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZ DAN BUZZ");
            } else if (i % 5 == 0) {
                System.out.println("BuZZ");

            }else if(i % 3 == 0 ){
                System.out.println("FIZZ");
            }else {
                System.out.println(i);
            }
        }
    }

}
