package SpeedTest;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ArrayList<String> test1 = new ArrayList<>();
        for (int i = 0; i < 500000; i++) {
            test1.add("Hello World!");
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;



        long start2 = System.currentTimeMillis();
        LinkedList<String> test2 = new LinkedList<>();
        for (int i = 0; i < 500000; i++) {
            test2.add("Hello World!");
        }
        long finish2 = System.currentTimeMillis();
        long elapsed2 = finish2 - start2;


        Instant start3 = Instant.now();
        ArrayList<String> test3 = new ArrayList<>();
        for (int i = 0; i < 500000; i++) {
            test3.add("Hello World!");
        }
        Instant finish3 = Instant.now();
        long elapsed3 = Duration.between(start3, finish3).toMillis();


        Instant start4 = Instant.now();
        LinkedList<String> test4 = new LinkedList<>();
        for (int i = 0; i < 500000; i++) {
            test4.add("Hello World!");
        }
        Instant finish4 = Instant.now();
        long elapsed4 = Duration.between(start4, finish4).toMillis();

        System.out.println("Size of ArrayList: " + test1.size());
        System.out.println("Size of LinkedList: " + test2.size());

        System.out.println();
        System.out.println("CurrentTimeMills:");
        System.out.println("Time of ArrayList: " + elapsed);
        System.out.println("Time of LinkedList: " + elapsed2);
        if (elapsed<elapsed2)
            System.out.println("ArrayList WIN!");
        else
            System.out.println("LinkedList WIN!");
        System.out.println();
        System.out.println("Instant and Duration:");
        System.out.println("Time of ArrayList: " + elapsed3);
        System.out.println("Time of LinkedList: " + elapsed4);
        if (elapsed3<elapsed4)
            System.out.println("ArrayList WIN!");
        else
            System.out.println("LinkedList WIN!");

    }
}
