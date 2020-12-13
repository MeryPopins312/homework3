package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws LimitException {
        double userMoney=20000;
        System.out.println("Введите pin: ");
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner.nextLine());
        System.out.println("Введите сумму которую хотите снять: ");
        System.out.println(scanner.nextLine());

       BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(userMoney);
        while (true){
            try {
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                e.printStackTrace();
                bankAccount.withDraw((int) bankAccount.getAmount());
                break;
            }
        }
    }
}
