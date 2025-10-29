package food.director;

import food.Burger;
import food.builder.BurgerBuilder;

public class Director {
    private BurgerBuilder burgerBuilder;

    public void setBuilder(BurgerBuilder burgerBuilder){
        this.burgerBuilder = burgerBuilder;
    }

    public Burger createBurger(){
        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSauce();
        burgerBuilder.buildSalad();
        return burgerBuilder.build();
    }
}
