package food;

import food.builder.CheeseBurgerBuilder;
import food.builder.VeganBurgerBuidler;
import food.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new CheeseBurgerBuilder());
        createBurger(director);
        director.setBuilder(new VeganBurgerBuidler());
        createBurger(director);
    }
    public static void createBurger(Director director) {
        Burger burger = director.createBurger();
        burger.print();
    }
}
