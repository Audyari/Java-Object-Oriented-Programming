package programmer.zaman.now.InterfaceInheritance;

public interface Car extends HasBrand {

    void drive();

    int getTier();

    default boolean isBig() {
        return false;
    }

}
