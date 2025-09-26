package rvt;

import java.util.Scanner;
import java.util.Random;

public class Minesanas_spele {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int res = random.nextInt(10) + 1;
        int count = 0;

        System.out.println("Es domaju par skaitli no 1 lidz 10.");
        System.out.println("Tev tas jauzmin tris meginajumos.");
        System.out.println("Ievadi minejumu:");


        while (count < 3) {
            int answer = Integer.valueOf(scanner.nextLine());

            if (res == answer) {
                System.out.println("PAREIZI!");
                System.out.println("Tu esi uzvarejis speli");
                break;
            } 
            System.out.println("nepareizi");
            count ++;
        }
        
        if (count == 3) {
            System.out.println("Pareizas skaitlis bija " + res + ".");
            System.out.println("Tu esi zaudejis speli.");
        }
            
            
            


        scanner.close();
    }
}
