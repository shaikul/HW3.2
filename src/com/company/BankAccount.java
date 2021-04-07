package com.company;

public class BankAccount {
    double amount;

    public void setdeposit( double sum) {
         sum = sum + amount;

         System.out.println("Ваш счет пополнен на сумму  " + sum );
    }

    public void  setwithDraw(int sum)  throws LimitException  {

        if(sum > amount) throw new LimitException ("У вас недостаточно средств на счете");
        this.amount = sum;
    }

    public double getAmount() {
        return amount;
    }
    public BankAccount(double amount) {
        this.amount = amount;
    }
}
