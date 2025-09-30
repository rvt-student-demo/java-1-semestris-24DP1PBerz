package rvt;

import java.util.Scanner;

public class Divisible_by_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2, 10);

        scanner.close();
    }

    public static void divisibleByThreeInRange(int beginning , int end) {
        for (;beginning <= end ; beginning++) {
            if (beginning % 3 == 0){
                System.out.println(beginning);
            
            }

        }
    }
}
