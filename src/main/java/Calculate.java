import java.util.Scanner;

public class Calculate {
    public static void calculate(int quantityPeople) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double sumPerPerson;
        String listProducts = "Добавленные товары:";

        while (true) {
            System.out.println("Напишите название блюда:");
            String productName = scanner.next();
            listProducts = listProducts + "\n" + productName; // собираем список продуктов

            System.out.println("Напишите цену на блюдо:");
            double productCost = scanner.nextDouble();
            sum = sum + productCost; // суммируем стоимость товаров

            System.out.println("Товар успешно добавлен");

            System.out.println("Желаете добавить еще товар?");
            String requestion = scanner.next(); // продолжает работу при вводе любого символа или текста

            if (requestion.equalsIgnoreCase("Завершить")) { // при вводе завершить, программа останавливает работу

                sumPerPerson = sum / quantityPeople; // делим общий счет на количество людей

                System.out.println(listProducts); // выводим список продуктов
                System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, Formater.formater(sumPerPerson));
                // выводим сумму для оплаты на каждого человека
                break;
            }
        }
    }
}
