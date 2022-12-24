package FurnitureShop;

public abstract class Furniture {
    private String name;
    private String color;
    private int cost;

    public abstract String aboutFurniture();

    public Furniture(String name, String color, int cost) {
       this.name = name;
        this.color = color;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCost() {
        return cost;
    }


}
