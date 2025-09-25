package rvt;
import java.util.Scanner;
public class Num_Sum_nums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int sum = 0;
        int count = -1;
    

        while (num != 0) {
            System.out.println("Give a number: ");
            num = Integer.valueOf(scanner.nextLine());
            sum = num + sum;
            count = count + 1;
        }

        System.out.println("Number of numbers: "  + count);
        System.out.println("Sum of the numbers: " + sum);

        scanner.close();
    }
}
