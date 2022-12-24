package FurnitureShop;

public class Sofa extends Furniture{
    public Sofa(String name, String color, int cost) {
        super(name, color, cost);
    }

    @Override
    public String aboutFurniture() {

        return "The Sofa: \"" + getName() + "\" Color: \"" + getColor() + "\" Cost: " + getCost() + "$";
    }

}
