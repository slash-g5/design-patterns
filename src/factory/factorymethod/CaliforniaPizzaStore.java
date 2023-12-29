package src.factory.factorymethod;

import src.factory.model.DefaultPizza;
import src.factory.model.Pizza;
import src.factory.model.california.CaliforniaCheesePizza;
import src.factory.model.california.CaliforniaChickenPizza;
import src.factory.model.california.CaliforniaPepperoniPizza;

public class CaliforniaPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese" -> {
                return new CaliforniaCheesePizza();
            }
            case "chicken" -> {
                return new CaliforniaChickenPizza();
            }
            case "pepperoni" -> {
                return new CaliforniaPepperoniPizza();
            }
            case default -> {
                return new DefaultPizza();
            }
        }

    }
}
