package rvt;
import java.util.Scanner;


public class Chapter44 {
    public static void main(String[] args) {
      //ex1();
      //ex2();
      //ex3();
      //ex4();
      //ex5();
      //ex6();
      ex7();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);  

        System.out.print("Enter your name: ");
        String input = scanner.nextLine().trim();

        int space = input.indexOf(" ");
        String first = input.substring(0, space);
        String last = input.substring(space  + 1);
        System.out.println(first + " " + last.toUpperCase());
    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println();

        for(int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public static void ex3() {
        Scanner scanner = new Scanner(System.in);

        while(true){
          System.out.println("Enter a name:");  
          String input = scanner.nextLine();

          if (input.startsWith("A") || input.startsWith("B") || input.startsWith("C")) {
            System.out.println("Ms. " + input);
            System.out.println();

          } else if (input.startsWith("E") || input.startsWith("F") || input.startsWith("G")) {
            System.out.println("Mr. " + input);
            System.out.println();

          } else if (input.equals("")){
            break;

          } else {
            System.out.println(input);
            System.out.println();

          }
        }
        
    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        int time = Integer.valueOf(scanner.nextLine());

        if (time < 100){
            System.out.println("Your time->  " + "0:" + time);
        
        } else {
            int min = time / 100;
            int sec = time % 100;
            System.out.println("Your time->  " + min + ":" + sec);
        }
    }

    public static void ex5() {
        Scanner scanner = new Scanner(System.in);
        boolean inb = false;

        while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            int slash = input.indexOf("//");

            if(slash != -1){
                System.out.println(input.substring(slash));
            }

            int start = input.indexOf("/*");
            int end = input.indexOf("*/");

            if (start != -1){
                inb = true;
                System.out.println(input.substring(start));
            }

            if(end != -1 && inb){
                System.out.println(input.substring(0, end + 2));
                inb = false;
            
            }

            if(inb && start == -1){
                System.out.println(input.trim());
            }
        }
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        boolean acceptable = false;

        while (!acceptable) {
            System.out.println("Enter your password: ");
            String password = scanner.nextLine();

            if (password.length() >= 7){
                boolean upper = !password.equals(password.toLowerCase());
                boolean lower = !password.equals(password.toUpperCase());

                boolean digit = false;
                for (int i = 0; i < password.length(); i++){
                    char ch = password.charAt(i);
                    if (Character.isDigit(ch)){
                        digit = true;
                        break;
                    }
                }

                if (upper && lower && digit){
                    System.out.println("Acceptable password.");
                    acceptable = true;
                } else {
                    System.out.println("That password is not acceptable.");
                }

            } else{
                System.out.println("That password is not acceptable.");
            }
            System.out.println();
        }
    }

    public static void ex7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word -->");
        String word = scanner.nextLine();

        int start = 0;
        int end = word.length();

        while( start < end ) {
            for (int i = 0; i < start; i++) {
                System.out.print(" ");
            }
            System.out.println(word.substring(start, end));
            start++;
            end--;
        }
    }
}
