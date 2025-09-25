package rvt;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Passwrd?");

        String pass = reader.nextLine();
        String password = "Caput Draconis";

        if (pass.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you! ");
        }

        reader.close();
    }

}
