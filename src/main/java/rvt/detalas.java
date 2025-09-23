package rvt;
import java.util.Scanner;
public class detalas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadiet skruvju daudzumu: ");
        int skruves = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet uzgrieznu daudzumu: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());

        System.out.println("Ievadiet paplaksnu daudzumu: ");
        int paplaksnes = Integer.valueOf(scanner.nextLine());

        final int bolt = 5;
        final int nut = 3;
        final int washer = 1;

        int sum = skruves * bolt + uzgriezni * nut + paplaksnes * washer;

        if (uzgriezni == skruves && skruves < paplaksnes * 2) {
            System.out.println("Skruvju skaits: "+ skruves);
            System.out.println("Uzgrieznu skaits: " + uzgriezni);
            System.out.println("Paplaksnu skaits: " + paplaksnes);

            System.out.println("Pasutijums ir kartiba");

            System.out.println("Kopeja cena: "+ sum);

        } else if (skruves > uzgriezni && skruves < paplaksnes * 2) {
            System.out.println("Skruvju skaits: "+ skruves);
            System.out.println("Uzgrieznu skaits: " + uzgriezni);
            System.out.println("Paplaksnu skaits: " + paplaksnes);

            System.out.println("Pārbaudi pasutijumu: par maz uzgrieznu");

            System.out.println("Kopeja cena: "+ sum);
        } else if (skruves == uzgriezni && skruves > paplaksnes * 2) {
            System.out.println("Skruvju skaits: "+ skruves);
            System.out.println("Uzgrieznu skaits: " + uzgriezni);
            System.out.println("Paplaksnu skaits: " + paplaksnes);

            System.out.println("Pārbaudi pasutijumu: par maz paplaksnu");

            System.out.println("Kopeja cena: "+ sum);
        } else if (skruves > uzgriezni && skruves > paplaksnes * 2){
            System.out.println("Skruvju skaits: "+ skruves);
            System.out.println("Uzgrieznu skaits: " + uzgriezni);
            System.out.println("Paplaksnu skaits: " + paplaksnes);
            
            System.out.println("Pārbaudi pasutijumu: par maz uzgrieznu");
            System.out.println("Pārbaudi pasutijumu: par maz paplaksnu");

            System.out.println("Kopeja cena: "+ sum);
        }

        scanner.close();
    }
    
}
