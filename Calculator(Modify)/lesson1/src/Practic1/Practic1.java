package Practic1;
import java.util.Scanner;

public class Practic1 {
    public static String metod;
    public static double number1;
    public static double number2;

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        System.out.println("Приметивный калькулятор.");
        System.out.println("Введите ваше первое число, например 5 или 5.7:");
        while (true){
        String number1_1 = scan.nextLine();
        try {
            number1 = Double.parseDouble(number1_1);
            break;
        }
        catch (Exception e){
            System.out.println("Ошибка! Вы ввели что-то не то, повторите попытку.");
        }
        }
        System.out.println("Введите ваше второе число, например 5 или 5.7:");
        while (true){
            String number2_1 = scan.nextLine();
            try {
                number2 = Double.parseDouble(number2_1);
                break;
            }
            catch (Exception e){
                System.out.println("Ошибка! Вы ввели что-то не то, повторите попытку.");
            }
        }

        System.out.println("Какую операцию вы хотите произвести (+, -, *, /): ");

        while(scan.hasNextLine()) {
            metod = scan.nextLine();
            boolean exit = true;
            if(exit == metod.equals("+") || exit == metod.equals("/") || exit == metod.equals("*")  || exit == metod.equals("-"))
            break;
            else {
                System.out.println("Ошибка.");
                System.out.println("Пожалуйста, выберите один из следующих символов: +, -, *, / ");
            }



        }
        MetodSwitch.Switch();
        MetodIfElse.IfElse();
    }
}
