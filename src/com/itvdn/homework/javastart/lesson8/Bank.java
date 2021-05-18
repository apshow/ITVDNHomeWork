package com.itvdn.homework.javastart.lesson8;

public class Bank {

    public static int initialTotalDebt = 700;

    static void creditStatus(int paymentMade){

        initialTotalDebt -= paymentMade;

        if (initialTotalDebt > 0){
            System.out.println("остаток долга - " + initialTotalDebt);
        } else if (initialTotalDebt < 0){
            System.out.println("переплата по кредиту равна  - " + initialTotalDebt);
        } else {
            System.out.println("кредит погашен");
        }
    }

    public static void main(String[] args) {
        creditStatus(400);
        creditStatus(100);
        creditStatus(100);
        creditStatus(100);
        creditStatus(200);
    }
}

//    Используя IntelliJ IDEA, создайте класс Bank.
//    Представьте, что вы реализуете программу для банка, которая помогает определить,
//    погасил ли клиент кредит или нет. Допустим, ежемесячная сумма платежа должна составлять 100 грн.
//    Клиент должен выполнить 7 платежей, но может платить реже большими суммами.
//    Т.е., может двумя платежами по 300 и 400 грн. Закрыть весь долг.
//    Создайте метод, который будет в качестве аргумента принимать сумму платежа, введенную экономистом банка.
//    Метод выводит на экран информацию о состоянии кредита (сумма задолженности, сумма переплаты,
//    сообщение об отсутствии долга).
