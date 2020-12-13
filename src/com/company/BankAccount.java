package com.company;

public class BankAccount  {
    private double amount;

    public double getAmount() {
        return amount;
    }
    public void deposit(double sum){
        amount=amount+sum;
        System.out.println("Вы ввели "+amount+" сумму на счет!");
    }
    public void withDraw(int sum) throws LimitException {
        if (sum>amount){
            throw new LimitException("У вас недостачно средств на счете!",sum);
        }
        amount=amount-sum;
        System.out.println("Вы сняли "+sum+"  со счета!");
        System.out.println("Остаток на счете составляет "+amount+" USD");
    }
}
