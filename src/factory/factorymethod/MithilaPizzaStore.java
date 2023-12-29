package src.factory.factorymethod;


import src.factory.model.DefaultPizza;
import src.factory.model.Pizza;
import src.factory.model.mithila.MithilaCheesePizza;
import src.factory.model.mithila.MithilaPepperoniPizza;
import src.factory.model.mithila.MithilaSakahariPizza;
import src.factory.model.mithila.MithilaSausagePizza;

public class MithilaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese" -> {
                return new MithilaCheesePizza();
            }
            case "pepperoni" -> {
                return new MithilaPepperoniPizza();
            }
            case "sausage" -> {
                return new MithilaSausagePizza();
            }
            case "veggie" -> {
                return new MithilaSakahariPizza();
            }
            case default -> {
                return new DefaultPizza();
            }
        }

    }
}
