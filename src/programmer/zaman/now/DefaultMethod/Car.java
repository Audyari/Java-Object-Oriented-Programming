package programmer.zaman.now.DefaultMethod;

public interface Car extends HasBrand, IsMaintenance  {

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}
