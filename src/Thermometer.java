import java.util.Scanner;

public class Thermometer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение температуры: ");
        double temperature = scanner.nextDouble();

        System.out.print("Введите единицу измерения (C или F): ");
        scanner.nextLine();
        String measure = scanner.nextLine();
        System.out.println(measure);
        if (measure.equals("C")) {
            double result = (temperature*9/5)+32;
            System.out.println("Вы ввели градусы по Цельсию, будет осуществлена конвертация в Фаренгейты");
            System.out.println(temperature + " градусов по Цельсию, составляет " + result + " градусов по Фаренгейту");
        } else if (measure.equals("F")) {
            double result = (temperature-32)*5/9;
            System.out.println("Вы ввели градусы по Фаренгейту, будет осуществлена конвертация в Цельсия");
            System.out.println(temperature + " градусов по Фаренгейту, составляет " + result + " градусов по Цельсию");
        } else {
            System.out.println("Неизвестная единица измерения");
        }
    }
}
