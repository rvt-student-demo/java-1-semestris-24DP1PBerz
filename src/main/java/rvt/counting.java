package rvt;
import java.util.Scanner;
public class counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.valueOf(scanner.nextLine());

        for (int sk = 0; sk < num+1; sk++){
            System.out.println(sk);
        }
        scanner.close();
    }
}
