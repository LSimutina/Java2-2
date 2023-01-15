public class Main {
    public static void main(String[] args) {

        int balans = 211; //начальная сумма баланса
        int totalAmount; //итоговый счет
        int amount = 1100; //пополнение
        int bonus=0;

        if (amount > 1000) {
            bonus = amount / 100;
            totalAmount = balans + amount;
        } else {
            totalAmount = balans + amount;
        }

        System.out.println("Итоговый счет: " + totalAmount);
        System.out.println("Итоговыфй Бонус: " + bonus);
    }
}