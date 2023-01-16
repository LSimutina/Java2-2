public class Main {
    public static void main(String[] args) {

        int balans = 100; //начальная сумма баланса
        int totalAmount; //итоговый счет
        int amount = 1100; //пополнение
        //boolean amountTrue=1000;
        int bonus = 0;

        if (amount > 1000) {
            bonus = amount / 100;
            totalAmount = balans + amount + bonus;
        } else {
            totalAmount = balans + amount + bonus;
        }

        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Итоговый Бонус: " + bonus);
    }
}