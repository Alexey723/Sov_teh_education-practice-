package FurnitureShop;

public class Bed extends Furniture{
    public Bed(String name, String color, int cost) {
        super(name, color, cost);
    }

    @Override
    public String aboutFurniture() {
        return  "The Bed: \"" + getName() + "\" Color: \"" + getColor() + "\" Cost: " + getCost() + "$";
    }

}
