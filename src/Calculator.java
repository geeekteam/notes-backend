import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите операцию (+, -, *, /): ");
        String operation = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        double result;

        if (operation.equals("+")) {
            result=a+b;
        } else if (operation.equals("-")) {
            result=a-b;
        } else if (operation.equals("*")) {
            result=a*b;
        } else if (operation.equals("/")) {
            if (b==0) {
                System.out.print("Ошибка: нельзя делить на 0");
                return;
            }
            result=a/b;
        } else {
            System.out.println("Неизвестная операция");
            return;
        }
        System.out.println("Результат вычисления: " + result);
    }
}
