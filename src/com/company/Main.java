package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(35000);

        while (true) try {
            System.out.println("Введите сумму снятия");
            bankAccount.setwithDraw(scanner.nextInt());
            System.out.println(" Введите вносимую");
            bankAccount.setdeposit(Double.parseDouble(scanner.next()));
        }catch (LimitException ie){
            System.out.println(ie.getMessage());
        }


    }
}
