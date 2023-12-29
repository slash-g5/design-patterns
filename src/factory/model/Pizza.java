package src.factory.model;

import src.factory.model.ingredients.cheese.Cheese;
import src.factory.model.ingredients.masala.Masala;
import src.factory.model.ingredients.sauce.Sauce;
import src.factory.model.ingredients.veggie.Veggie;

import java.util.concurrent.TimeUnit;

public abstract class Pizza {
    // prepare should be abstract ideally
    Veggie[] veggies;
    Sauce sauce;
    Cheese cheese;
    Masala masala;
    public void prepare(){
        System.out.println("Preparing The Pizza");
    }

    public void bake() {
        System.out.println("Baking The Pizza");
    }

    public void cut() {
        System.out.println("Cutting The Pizza");
    }

    public void box(){
        System.out.println("Boxing The Pizza");
    }

    public void eat() {
        try {
            System.out.println("Started Eating Pizza");
            TimeUnit.SECONDS.sleep(4);
            System.out.println("Finished Eating Pizza");
        } catch (InterruptedException e) {
            System.out.println("Alert!! Food Poison");
            throw new RuntimeException(e);
        }
    }
}
