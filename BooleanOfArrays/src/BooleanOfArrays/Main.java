package BooleanOfArrays;

import java.util.*;

public class Main {



    public static void main(String[] args) {

        // Создаем массив класса Array2
       ArrayList<Array2> array2s = new ArrayList<>();
       array2s.add(new Array2(10));
       array2s.add(new Array2(20));
       array2s.add(new Array2(30));
       array2s.add(new Array2(40));
       array2s.add(new Array2(50));
       array2s.add(new Array2(60));

        // Создаем массив типа Array2
       Array2 [] arrays1 = {new Array2(10), new Array2(20), new Array2(30), new Array2(40), new Array2(50), new Array2(60)};

       // Преобразуем массив arrays1 в List типа Array2
       List<Array2> array2List = new ArrayList<>(List.of(arrays1));

       // Преобразуем ArrayList<Array2> в массив типа Array2
        Array2[] arrayInt = new Array2[array2s.size()];
        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = array2s.get(i);
        }

        // вывод на экран.
        System.out.println("ArrayList<Array2> array2s: " + array2s);
        System.out.println("Array2 [] arrays1: " + Arrays.toString(arrays1));
        System.out.println("List<Array2> array2List: " + array2List);
        System.out.println("Array2[] arrayInt:" + Arrays.toString(arrayInt));
        System.out.println("Прямое сравнение: " + array2s.equals(arrays1));
        System.out.println("Сравниваем через преобразования массива в ArrayList: " + array2List.equals(array2s));
        System.out.println("Сравниваем через преобразования ArrayList в массив: " + Arrays.equals(arrayInt, arrays1));
        }




    }



