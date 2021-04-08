package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        BankAccount bankAccount = new BankAccount(35000);

        while (true) try {
            System.out.println("Введите сумму снятия");
            bankAccount.setwithDraw(scanner.nextInt());

        }catch (LimitException ie){
            System.out.println(ie.getMessage());
            System.out.println("У вас получилось снять " + bankAccount.getAmount());
            try {
                bankAccount.setwithDraw((int) bankAccount.getAmount());
            } catch (LimitException e) {
                e.printStackTrace();
            }
            break;
        }


    }
}
