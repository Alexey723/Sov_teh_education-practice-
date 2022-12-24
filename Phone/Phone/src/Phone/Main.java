package Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone2 = new Phone("a",5, 10);
        Phone phone3 = new Phone(5,10);
        phone.reciveCall("Вася");

    }
}
