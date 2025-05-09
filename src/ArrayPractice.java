public class ArrayPractice {

    public static int sum(int[] numbers){
        int arraySum = 0;
        for (int i : numbers){
            arraySum += i;
        }
        return arraySum;
    }

    public static int max(int[] numbers){
        int arrayMax = numbers[0];
        for (int n : numbers){
            if (n>arrayMax) arrayMax = n;
        }
        return arrayMax;
    }

    public static void main(String[] args) {
        int[] numbers = {12,34,56,23,1,423,54,234,4567,23,1,124,0};
        System.out.println("Сумма элементов массива: "+sum(numbers));
        System.out.println("Максимальное значение массива: "+max(numbers));
    }
}