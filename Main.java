
import src.factory.factorymethod.MithilaPizzaStore;
import src.factory.factorymethod.PizzaStore;
import src.factory.model.Pizza;
import src.factory.simplefactory.SimplePizzaFactory;
import src.factory.simplefactory.SimplePizzaStore;

public class Main {
    public static void main(String[] args){
        simpleFactoryTest();
        abstractFactoryTest();
    }

    private static void simpleFactoryTest() {
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(new SimplePizzaFactory());
        Pizza pizza = simplePizzaStore.orderPizza("cheese");
        pizza.eat();
    }

    private static void abstractFactoryTest() {
        PizzaStore mithilaPizzaStore = new MithilaPizzaStore();
        Pizza pizza = mithilaPizzaStore.orderPizza("cheese");
        pizza.eat();
    }
}
