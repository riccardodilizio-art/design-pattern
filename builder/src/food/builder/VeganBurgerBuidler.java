package food.builder;

public class VeganBurgerBuidler extends BurgerBuilder{
    @Override
    public void buildBun() {
        burger.setBun("Black Bread");
    }

    @Override
    public void buildMeat() {
        burger.setBun("No Meat");

    }

    @Override
    public void buildSalad() {
        burger.setBun("Valeriana");
    }

    @Override
    public void buildCheese() {
        burger.setBun("Italian Cheese");
    }

    @Override
    public void buildSauce() {
        burger.setBun("No Sauce");
    }
}
