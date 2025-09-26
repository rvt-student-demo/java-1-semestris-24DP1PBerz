package rvt;
import java.util.Scanner;
public class Repeating_breaking_remembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");
        int num = 0;
        int sum = 1;
        int nums = -1;
        int odd = -1;
        int even = 0;

        while (num != -1) {
            num = Integer.valueOf(scanner.nextLine());
            sum += num;
            nums ++;
            if (num % 2 == 0) {
                even ++;
            } else {
                odd ++;
            }
        }
    
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+ sum); 
        System.out.println("Numbers: " + nums);
        System.out.println("Average: " + (sum * 1.0 / nums) );
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        scanner.close();
    }

}
