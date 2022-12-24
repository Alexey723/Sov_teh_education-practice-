package FurnitureShop;

public class Table extends Furniture{
    public Table(String name, String color, int cost) {
        super(name, color, cost);
    }

    @Override
    public String aboutFurniture() {
        return "The Table: \"" + getName() + "\" Color: \"" + getColor() + "\" Cost: " + getCost() + "$";

    }

}
