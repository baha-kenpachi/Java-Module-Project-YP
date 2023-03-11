import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек разделить счёт?");
        int quantityPeople;
        while (true) {
            quantityPeople = scanner.nextInt();
            if (quantityPeople == 1) { //останавливаем
                System.out.println("Счет не требуется делить!");
                break;
            } else if (quantityPeople < 1) { //просим заново ввести колличество людей
                System.out.println("Не корректное колличество людей, значение должно быть больше 1.");
            } else { //начинаем собирать название товаров и цены пока не будет команды завершить
                Calculate.calculate(quantityPeople);
                return;
            }
        }
    }
}
