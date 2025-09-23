package rvt;
import java.util.Scanner;

public class Gift_tax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scanner.nextLine());
        if (gift > 4999 && gift < 25001) {
            System.out.println("Tax: "+ (100 + (gift - 5000)* 0.08));

        } else if (gift > 24999 && gift < 55001) {
            System.out.println("Tax: "+ (1700 + (gift - 25000)*0.10));

        } else if (gift > 54999 && gift < 200001) {
            System.out.println("Tax: "+ (4700 + (gift - 200000)*0.12));

        }else if (gift > 199999 && gift < 1000001) {
            System.out.println("Tax: "+ (22100 + (gift - 1000000)*0.15));

        }else if (gift > 1000000) {
            System.out.println("Tax: "+ (142100 + (gift - 1000000)*0.17));

        } else {
            System.out.println("No Tax!");

        }
        scanner.close();
    }
}
