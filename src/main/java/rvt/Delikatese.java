package rvt;
import java.util.Scanner;
public class Delikatese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ievadi preci: ");
        String prece = String.valueOf(scanner.nextLine());

        System.out.print("Ievadi cenu: ");
        double cena = Double.valueOf(scanner.nextLine());

        System.out.print("Ekspress piegade (0 == nee, 1 == jaa): ");
        int ekspress = Integer.valueOf(scanner.nextLine());

        if (cena < 10 && ekspress == 1) {
             double piegade = 5.00;
             double sum = cena + piegade;
             System.out.println("Rekins: \n" + prece + "\t" + cena + "\nPiegade: " + piegade + "\nKopa: " + sum  );
        } else if (cena < 10 && ekspress == 0) {
            double piegade = 2.00;
            double sum = cena + piegade;
            System.out.println("Rekins: \n" + prece + "\t" + cena + "\nPiegade: " + piegade + "\nKopa: " + sum  );

        } else if (cena >= 10 && ekspress == 1) {
            double piegade = 3.00;
            double sum = cena + piegade;
            System.out.println("Rekins: \n" + prece + "\t" + cena + "\nPiegade: " + piegade + "\nKopa: " + sum  );

        } else {
            double piegade = 0.00;
            double sum = cena + piegade;
            System.out.println("Rekins: \n" + prece + "\t" + cena + "\nPiegade: " + piegade + "\nKopa: " + sum  );

        }




        scanner.close();
    }
    
}
