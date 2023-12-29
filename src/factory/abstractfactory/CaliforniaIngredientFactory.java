package src.factory.abstractfactory;

import src.factory.model.ingredients.cheese.Cheese;
import src.factory.model.ingredients.cheese.VideshiCheese;
import src.factory.model.ingredients.masala.Masala;
import src.factory.model.ingredients.masala.PardesiMasala;
import src.factory.model.ingredients.sauce.HotSauce;
import src.factory.model.ingredients.sauce.Sauce;
import src.factory.model.ingredients.veggie.StuffedVeggie;
import src.factory.model.ingredients.veggie.Veggie;

public class CaliforniaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new StuffedVeggie()};
    }

    @Override
    public Sauce createSauce() {
        return new HotSauce();
    }

    @Override
    public Masala createMasala() {
        return new PardesiMasala();
    }

    @Override
    public Cheese createCheese() {
        return new VideshiCheese();
    }
}
