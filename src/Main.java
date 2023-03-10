public class Main {

    public static void main(String[] args) {

        int account = 100; // Сумма начального счета.
        int paying = 1001;  // Сумма пополнения.
        int bonus = paying / 100; // Кол-во начисленных бонусов.

        if (paying > 1000) {
            System.out.println("Добрый день!");
            System.out.println("Благодарим Вас за пополнение счета");
            System.out.println("Вам начисленны бонусы в размере:" + " " + (bonus) + "руб.");
            System.out.println("Итоговая сумма на Вашем счету составляет:" + " " + (account + paying + bonus) + "руб.");
        } else {
            System.out.println("Добрый день!");
            System.out.println("Благодарим Вас за пополнение счета");
            System.out.println("Итоговая сумма на Вашем счету составляет:" + " " + (account + paying) + "руб.");
        }
    }
}
