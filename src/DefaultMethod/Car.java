package DefaultMethod;

public interface Car {

    public abstract void drive();

    public abstract int getTire();

    public default Boolean isBig(){
        return false;
    }
}
