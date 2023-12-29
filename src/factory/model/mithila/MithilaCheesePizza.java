package src.factory.model.mithila;

import src.factory.model.Pizza;

public class MithilaCheesePizza extends Pizza {
    @Override
    public void prepare(){
        System.out.println("Chalu bhe gaila re cheese wala pizza");
    }
    @Override
    public void bake(){
        System.out.println("Tawa p chadhal hau re");
    }
    @Override
    public void cut(){
        System.out.println("Golka bn gayle hai, kaat k dei chiyai");
    }
    @Override
    public void box(){
        System.out.println("Aluminium Foil se lapetal chi");
    }
}
