package Practic1;

public class MetodSwitch {

    public static void Switch() {
        System.out.println("Метод \"switch\":");
        switch (Practic1.metod) {
            case "+":
                double result1 = Practic1.number1 + Practic1.number2;
                System.out.printf("Результат: %.2f%n", result1);
                break;
            case "-":
                double result2 = Practic1.number1 - Practic1.number2;
                System.out.printf("Результат: %.2f%n", result2);
                break;
            case "*":
                double result3 = Practic1.number1 * Practic1.number2;
                System.out.printf("Результат: %.2f%n", result3);
                break;
            case "/":
                if(Practic1.number2 != 0) {
                    double result4 = Practic1.number1 / Practic1.number2;
                    System.out.printf("Результат: %.2f%n", result4);
                    break;
                }
                else {
                    System.out.println("На ноль делить нельзя!");
                }
        }
        System.out.println("------------------------");
    }
}
