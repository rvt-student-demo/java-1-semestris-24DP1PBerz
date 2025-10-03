package rvt;

public class Advanced_astrology {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        printTriangle(4);
        christmasTree(10);
    }

    public static void printSpaces(int number) {
        for( int i = 0; i < number; i++){
            System.out.print(" ");
        }
    }

    public static void printStars(int number) {
        for( int i = 0; i < number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for(int i = 1; i <= size; i++ ) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        for(int i = 1; i <= height; i++ ) {
            printSpaces(height-i);
            printStars(2 * i -1);   
        }
        for (int j = 0; j < 2; j++) {
            printSpaces(height-2);
            printStars(3);
        }
    }

}
