package rvt;

import java.util.Scanner;
import java. util.ArrayList;

public class Books {
    public class book {
        String title;
        int pages;
        int years;
    
        public book(String title, int pages, int years) {
            this.title = title;
            this.pages = pages;
            this.years = years;
        }

        public String name(){
            return this.title;
        }

        public String toString(){
            return this.title + ", " + this.pages + " pages, " + this.years;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<book> books = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int years = Integer.valueOf(scanner.nextLine());

            book Book = new Books().new book(title, pages, years);
            books.add(Book);
        }
        System.out.print("What information will be printed? ");
        String answ = scanner.nextLine();
        if(answ.equals("everything")){
            for(book title : books){
                System.out.println(title);
            }
        } else if (answ.equals("name")){
            for(book title : books){
                System.out.println(title.name());
            }
        }

        scanner.close();
    }

}
