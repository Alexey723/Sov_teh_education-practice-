package Practic2;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrays;
        int count;
        System.out.println("Please enter the length of elements:");
        while(true) {
            String line = scan.nextLine();
           try
           {
               count = Integer.parseInt(line);
               arrays = new int[count];
               for (int i = 0; i < arrays.length ; i++) {
                   System.out.println("Please enter next elements of index " + i +" :");
                   String line2 = scan.nextLine();
                   arrays[i] = Integer.parseInt(line2);
               }
               for (int i = 0; i < arrays.length ; i++) {
                   System.out.println("The array ["+i+"] : " + arrays[i]);
               }
               break;
           }
           catch (NumberFormatException e){
               System.out.println("Thats not a int.");
               System.out.println("Let`s start from beggining.");
               System.out.println("Please enter the length of elements:");
           }

        }
    }
}
