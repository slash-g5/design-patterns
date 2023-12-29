package src.factory.simplefactory;

import src.factory.model.*;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        switch (type) {
            case "cheese" -> {
                return new CheesePizza();
            }
            case "pepperoni" -> {
                return new PepperoniPizza();
            }
            case "sausage" -> {
                return new SausagePizza();
            }
            case "desi" -> {
                return new DesiPizza();
            }
            case default -> {
                return new DefaultPizza();
            }
        }

    }
}