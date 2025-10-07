package rvt;

public class Sum_of_array {
    public static void main(String[] args) {
        
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
        
    }
    public static void sumOfNumbersInArray(int[] array) {
        int[] numbers = {5, 1, 3, 4, 2};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
    }
}
