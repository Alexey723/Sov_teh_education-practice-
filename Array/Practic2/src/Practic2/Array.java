package Practic2;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrays;
        int lengthOfArray;




        System.out.println("¬ведите длину массива:");
        while(true) {
            String line = scan.nextLine(); // вводим длину массива.
            try {
                lengthOfArray = Integer.parseInt(line); // преобразуем в int.
                arrays = new int[lengthOfArray];
                for (int i = 0; i < arrays.length; i++) {
                    System.out.println("¬ведите следующий элемент " + i + " :");
                    String line2 = scan.nextLine(); // вводим элемент массива
                    arrays[i] = Integer.parseInt(line2); // преобразуем в int.
                }
                for (int i = 0; i < arrays.length; i++) {
                    System.out.println(" [" + i + "] : " + arrays[i]);  // вывод на экран
                }
                Arrays.sort(arrays);
                for (int i = 0; i < arrays.length; i++)
                {
                    int count = 1;
                    int k = -1;
                    for (int j = i+1; j < arrays.length; j++)
                    {

                        if(arrays[i] == arrays[j])
                        {
                            count++;
                            k=j-1;
                        }
                        else break;
                    }
                    System.out.println("Ёлемент " + arrays[i] + " повтор€етс€ " + count + " р.");
                    if(k!=-1)
                        i=k+1;
                }

                break;
            }


            catch (NumberFormatException e){
                System.out.println("Ёто не int.");
                System.out.println("ƒавайте начнем сначала.");
                System.out.println("¬ведите длину массива:");
            }}

    }
}
