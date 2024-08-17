package Enum;

public class PanggilEnum {


    public static void main(String[] args) {
      ObjekEnum panggilObjek = new ObjekEnum();

      panggilObjek.setName("ASEP");
      panggilObjek.setPeringkat(Level.ADMIN);
      panggilObjek.peringkat = Level.ADMIN;

      System.out.println(panggilObjek.getName());
      System.out.println(panggilObjek.getPeringkat());
      System.out.println(panggilObjek.getPeringkat().getDescription());

      System.out.println("###### KONVERSI TIPE DATA ############");

      String conversiEnumKeString = Level.USER.name();
      System.out.println(conversiEnumKeString);
      String conversiEnumKeString1 = Level.USER.description;
      System.out.println(conversiEnumKeString1);

      Level conversiKeEnum = Level.valueOf("SUPERADMIN");
      System.out.println(conversiKeEnum);


      System.out.println("###### KONVERSI TIPE DATA ARRAY ############");
      for(var conversiKeArray:Level.values() ){
        System.out.println(conversiKeArray);
        if(conversiKeArray == Level.ADMIN){
          System.out.println("SUPERADMIN is at index: " + conversiKeArray.ordinal());
        }
      }






    }
}
