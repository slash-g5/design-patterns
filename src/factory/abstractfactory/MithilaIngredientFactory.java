package src.factory.abstractfactory;

import src.factory.model.ingredients.cheese.BihariCheese;
import src.factory.model.ingredients.cheese.Cheese;
import src.factory.model.ingredients.masala.DesiMasala;
import src.factory.model.ingredients.masala.Masala;
import src.factory.model.ingredients.sauce.HotSauce;
import src.factory.model.ingredients.sauce.Sauce;
import src.factory.model.ingredients.veggie.PannerVeggie;
import src.factory.model.ingredients.veggie.StuffedVeggie;
import src.factory.model.ingredients.veggie.Veggie;

public class MithilaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Veggie[] createVeggies() {
        return new Veggie[]{new PannerVeggie(), new StuffedVeggie()};
    }

    @Override
    public Sauce createSauce() {
        return new HotSauce();
    }

    @Override
    public Masala createMasala() {
        return new DesiMasala();
    }

    @Override
    public Cheese createCheese() {
        return new BihariCheese();
    }
}
