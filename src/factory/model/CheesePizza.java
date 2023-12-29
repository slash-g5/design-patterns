package src.factory.model;

public class CheesePizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Wrapping Cheese Pizza");
    }
}
