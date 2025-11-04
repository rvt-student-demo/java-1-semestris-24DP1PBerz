package rvt;

public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        if (balance >= 2.60) {
            balance -= 2.60; 
        }
        return;
    }

    public void eatHeartily() {
        if(balance >= 4.60){
            balance -= 4.60;
        }
       return;
    }

    public void addMoney(double amount) {
        double overall;
        double limit;
        if (amount > 0) {
            overall = balance + amount;
            limit = overall - 150;
            if (overall > 150) {
                overall -= limit;
            }
            balance = overall;
        }
        return;
        
    }

    

}
