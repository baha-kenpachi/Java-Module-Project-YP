import java.util.Scanner;

public class People {
    public static void quantityPeople(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счёт?");
        int quantityPeople;
        while (true) {
            if (scanner.hasNextInt()){
                quantityPeople = scanner.nextInt();
                if (quantityPeople == 1) { //останавливаем
                    System.out.println("Счет не требуется делить если один человек! Введите целое число больше 1.");
                    //break;
                } else if (quantityPeople < 1) { //просим заново ввести колличество людей
                    System.out.println("Не корректное колличество людей, значение должно быть больше 1.");
                } else if (quantityPeople > 1) { //начинаем собирать название товаров и цены пока не будет команды завершить
                    Calculate.calculate(quantityPeople); // quantityPeople добавляем что бы сумму разделить на количество людей
                    return;
                }
            } else {
                scanner.nextLine();
                System.out.println("Неверный ввод. Требуется ввести целое число.");
            }
        }
    }
}
