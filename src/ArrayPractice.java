public class ArrayPractice {

    public static int sum(){
        int[] numbers = {1, 3, 5, 7, 9};
        int arrsum = 0;
        for (int i = 0; i<numbers.length; i++){
            arrsum = arrsum + numbers[i];
        }
        return arrsum;
    }

    public static void main(String[] args) {
        int result = sum();
        System.out.println(result);
    }
}