package rvt;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 3, 5, 7, 9};
        for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
        }
        System.out.println("Give two indices to swap: ");
        int index1 = scanner.nextInt();
        int index2 =scanner.nextInt();

        System.out.println();

        int h = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = h;

        for (int i = 0; i < numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }


}
