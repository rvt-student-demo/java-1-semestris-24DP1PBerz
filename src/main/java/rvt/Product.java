package rvt;

import java.util.ArrayList;

public class Product {
    //atribūti
    String name;
    double price;
    String from; 

    //konstruktors ar nosaukumu, cenu un izcelsmes valsti
    public Product(String name, double price, String from) {
       this.name = name;
       this.price = price;
       this.from = from;
    }
    //metode kurā izvada info
    void getInfo() {
        System.out.println("Produkts: " + name + " \tCena: " + price + "\tNo " + from);
    }
    //metode kurā izvada galīgo cenu
    void getFinalPrice(){
        System.out.println("\tGaliga cena: " + price);         
    }
    //apakšklase kura manto no product klases
    public static class FoodProduct extends Product{
        // papildus atribūts
        String expiryDate;
        //konstruktors ar nosaukumu, cenu, izcelsmes valsti un derīguma termiņu
        public FoodProduct(String name, double price, String from, String expiryDate) {
            super(name, price, from);
            this.expiryDate = expiryDate;

        }
        // metode kur pievieno getinfo termiņu
        @Override
        void getInfo() {
            super.getInfo();
            System.out.println("\tTermins: " + expiryDate);

        }
    }
    // apakšklase 
    public static class DiscountProduct extends Product {
        int discountPercent;
        //konstruktors ar nosaukumu, cenu, izcelsmes valsti un atlaides procentu
        public DiscountProduct(String name, double price, String from, int discountPercent){
            super(name, price, from);
            this.discountPercent = discountPercent;
            
        }
        // metode kur pārraksta getfinalprice izrēķinot cenu ar atlaidi
        @Override
        void getFinalPrice() {
            System.out.println("\tGaliga cena: " + (price - (price * discountPercent / 100.0)));
        }
    }
        //main metode
        public static void main(String[] args) {
            // masīvs
            ArrayList<Product> product = new ArrayList<Product>();
            //ievada produktus un ievieto masīvā
            Product product1 = new Product("Pringles", 2.87, "USA");
            product.add(product1);
            Product product2 = new Product("Nestea", 1.99, "Polija");
            product.add(product2);
            Product.FoodProduct product3 = new Product.FoodProduct("Nudelu zupa", 2.36, "Korejas Republika", "04.12.2026");
            product.add(product3);
            Product.DiscountProduct product4 = new Product.DiscountProduct("Milka", 6.49, "Austrija", 35);
            product.add(product4);

            // for cikls kurā izsauc metodes
            for(int i = 0; i < product.size(); i++){
                product.get(i).getInfo();
                product.get(i).getFinalPrice();
            }


        }


}
