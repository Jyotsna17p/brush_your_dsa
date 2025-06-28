package designpatters.creational.abstractt;

public class IndianKitchen implements MealFactory{
    @Override
    public Burger createBurger() {
        return new VegBurger();
    }

    @Override
    public Drink drink() {
        return new Lassi();
    }
}
