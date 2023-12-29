package src.factory.abstractfactory;

import src.factory.model.ingredients.cheese.Cheese;
import src.factory.model.ingredients.masala.Masala;
import src.factory.model.ingredients.sauce.Sauce;
import src.factory.model.ingredients.veggie.Veggie;

public interface PizzaIngredientFactory {
    Veggie[] createVeggies();
    Sauce createSauce();
    Masala createMasala();
    Cheese createCheese();
}
