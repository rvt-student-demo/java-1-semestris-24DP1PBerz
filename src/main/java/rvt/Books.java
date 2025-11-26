package rvt;
import java.util.Scanner;
import java.util.ArrayList;

public class Books {
    private String title;
    private int pages;
    private int published;

    public Books(String title, int count, int published){
        this.title = title;
        this.pages = pages;
        this.published = published;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Books> books = new ArrayList<>();


        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if(title.equals("")){
                break;
            }

            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int published = Integer.valueOf(scanner.nextLine());

            Books.add(new Books(title));

           
        }



    }

}
