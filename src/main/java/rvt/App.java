package rvt;
import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int res = random.nextInt(6) + 1;
        System.out.println(res);


        scanner.close();
    }
}


