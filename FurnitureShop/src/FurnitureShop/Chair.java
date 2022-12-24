package FurnitureShop;

public class Chair extends Furniture {
    public Chair(String name, String color, int cost) {
        super(name, color, cost);
    }

    @Override
    public String aboutFurniture() {
        return "The Chair: \"" + getName() + "\" Color: \"" + getColor() + "\" Cost: " + getCost() + "$";

    }
}
