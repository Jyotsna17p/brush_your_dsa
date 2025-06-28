package designpatters.creational.builder;

public class Pizza {
    String size;
    boolean cheese;
    boolean mushroom;

    private Pizza(PizzzBuilder pizzzBuilder) {
        this.size = pizzzBuilder.size;
        this.cheese = pizzzBuilder.cheese;
        this.mushroom = pizzzBuilder.mushroom;
    }

    public static class PizzzBuilder {
        String size;
        boolean cheese;
        boolean mushroom;

        public  PizzzBuilder(String size){
           this.size = size;
        }

        public PizzzBuilder addCheese(boolean cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzzBuilder addMushroom(boolean mushroom){
            this.mushroom = mushroom;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheese=" + cheese +
                ", mushroom=" + mushroom +
                '}';
    }
}
