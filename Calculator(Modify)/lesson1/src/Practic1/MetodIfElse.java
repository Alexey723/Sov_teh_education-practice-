package Practic1;

public class MetodIfElse {
    public static void IfElse(){
        System.out.println("����� \"IF - ELSE\":");
        if (Practic1.metod.equals("/") && Practic1.number2 == 0){
            System.out.println("�� ���� ������ ������!");
        }
          else if (Practic1.metod.equals("/")){
            double result5 = Practic1.number1 / Practic1.number2;
            System.out.printf("���������: %.2f", result5);
        } else if (Practic1.metod.equals("*")) {
            double result6 = Practic1.number1 * Practic1.number2;
            System.out.printf("���������: %.2f", result6);
        } else if (Practic1.metod.equals("-")) {
            double result7 = Practic1.number1 - Practic1.number2;
            System.out.printf("���������: %.2f", result7);
        } else if (Practic1.metod.equals("+")) {
            double result8 = Practic1.number1 + Practic1.number2;
            System.out.printf("���������: %.2f", result8);
        } else {
            System.out.println("Uknown metod.");
        }
    }
}
