package Phone;

import java.io.PrintStream;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(){
        number = "89883148858";
        model  = "Honor 10i";
        weight = 100;
        System.out.println(getNumber() + " " + getModel() + " " + getWeight());
    }
    public Phone (String a, int b1, int x){
        number = "89536589878";
        model  = "Samsung S20";
        weight = 150;
        System.out.println(getNumber() + " " + getModel() + " " + getWeight());
    }
    public Phone (int a3, int b3){
        number = "89608705698";
        model  = "Nokia 3210";
        System.out.println(getNumber() + " " + getModel());
    }
    public PrintStream reciveCall(String name){
        return System.out.printf("Звонит %s%n", getNumber());
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
