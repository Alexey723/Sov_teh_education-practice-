package Practic2;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] arrays;
        int lengthOfArray;




        System.out.println("������� ����� �������:");
        while(true) {
            String line = scan.nextLine(); // ������ ����� �������.
            try {
                lengthOfArray = Integer.parseInt(line); // ����������� � int.
                arrays = new int[lengthOfArray];
                for (int i = 0; i < arrays.length; i++) {
                    System.out.println("������� ��������� ������� " + i + " :");
                    String line2 = scan.nextLine(); // ������ ������� �������
                    arrays[i] = Integer.parseInt(line2); // ����������� � int.
                }
                for (int i = 0; i < arrays.length; i++) {
                    System.out.println(" [" + i + "] : " + arrays[i]);  // ����� �� �����
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
                    System.out.println("������� " + arrays[i] + " ����������� " + count + " �.");
                    if(k!=-1)
                        i=k+1;
                }

                break;
            }


            catch (NumberFormatException e){
                System.out.println("��� �� int.");
                System.out.println("������� ������ �������.");
                System.out.println("������� ����� �������:");
            }}

    }
}
