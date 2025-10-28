package rvt;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Statistics statistics = new Statistics();
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != 1) {
            statistics.addNumber(num);
            num = scanner.nextLine();
        }
        
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}
