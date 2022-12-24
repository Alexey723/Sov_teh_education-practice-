package FurnitureShop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Furniture`s Shop.\nToday we have:");
        Chair[] chairs = new Chair[3];
        chairs[0] = new Chair("King", "Red", 100);
        chairs[1] = new Chair("Citizen", "blue", 50);
        chairs[2] = new Chair("Graff", "Yellow", 70);
        for (Chair chair : chairs) {
            String area = chair.aboutFurniture();
            System.out.println(area);
        }
        Sofa[] sofas = new Sofa[3];
        sofas[0] = new Sofa("Anna", "Blue", 150);
        sofas[1] = new Sofa("Tiffany", "White", 170);
        sofas[2] = new Sofa("Joane", "Pink", 195);
        for (Sofa sofa : sofas) {
            String area = sofa.aboutFurniture();
            System.out.println(area);
        }
        Bed[] beds = new Bed[3];
        beds[0] = new Bed("Well Dreams", "Green", 150);
        beds[1] = new Bed("Good night", "Orange", 250);
        beds[2] = new Bed("Morfeus", "Light-blue", 300);
        for (Bed bed : beds) {
            String area = bed.aboutFurniture();
            System.out.println(area);
        }
        Table[] tables = new Table[3];
        tables[0] = new Table("Wood", "Classic", 50);
        tables[1] = new Table("Tasty", "Black", 85);
        tables[2] = new Table("Royall", "Gold", 350);
        for (Table table : tables) {
            String area = table.aboutFurniture();
            System.out.println(area);
        }
    }


}
