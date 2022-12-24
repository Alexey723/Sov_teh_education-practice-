package BooleanOfArrays;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        // ������� ������ ������ Array2
       ArrayList<Array2> array2s = new ArrayList<>();
       array2s.add(new Array2(10));
       array2s.add(new Array2(20));
       array2s.add(new Array2(30));
       array2s.add(new Array2(40));
       array2s.add(new Array2(50));
       array2s.add(new Array2(60));

        // ������� ������ ���� Array2
       Array2 [] arrays1 = {new Array2(10), new Array2(20), new Array2(30), new Array2(40), new Array2(50), new Array2(60)};

       // ����������� ������ arrays1 � List ���� Array2
       List<Array2> array2List = new ArrayList<>(List.of(arrays1));

       // ����������� ArrayList<Array2> � ������ ���� Array2
        Array2[] arrayInt = new Array2[array2s.size()];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = array2s.get(i);
        }

        // ����� �� �����.
        System.out.println("ArrayList<Array2> array2s: " + array2s);
        System.out.println("Array2 [] arrays1: " + Arrays.toString(arrays1));
        System.out.println("List<Array2> array2List: " + array2List);
        System.out.println("Array2[] arrayInt:" + Arrays.toString(arrayInt));
        System.out.println("������ ���������: " + array2s.equals(arrays1));
        System.out.println("���������� ����� �������������� ������� � ArrayList: " + array2List.equals(array2s));
        System.out.println("���������� ����� �������������� ArrayList � ������: " + Arrays.equals(arrayInt, arrays1));
        }




    }



