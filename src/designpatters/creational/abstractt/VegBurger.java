package designpatters.creational.abstractt;

public class VegBurger implements Burger{
    @Override
    public void createBurger() {
        System.out.println("I am veg burger");
    }
}
