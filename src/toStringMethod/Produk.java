package toStringMethod;

public class Produk {

    String name;
    int price;

    Produk(String name, int price) {
        this.name = name;
        this.price = price;

    }

    @Override
    public String toString() {
        return "Ovrride Objek toString " + name + " " + price;
    }


    public static void main(String[] args) {
        Produk testProduk = new Produk("Bedak",15000);
        System.out.println(testProduk.toString());
    }
}
