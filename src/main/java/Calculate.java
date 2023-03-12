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
            //listProducts = listProducts + "\n" + productName; // собираем список продуктов

            System.out.println("Напишите цену на блюдо:");

            if (scanner.hasNextDouble()) {

                double productCost = scanner.nextDouble();
                listProducts = listProducts + "\n" + productName; // собираем список продуктов
                sum += productCost; // суммируем стоимость товаров
                System.out.println("Товар успешно добавлен.\nЖелаете добавить еще товар?");

                String requestion = scanner.next(); // продолжает работу при вводе любого символа или текста

                if (requestion.equalsIgnoreCase("Завершить")) { // при вводе завершить, программа останавливает работу

                    sumPerPerson = sum / quantityPeople; // делим общий счет на количество людей

                    System.out.println(listProducts); // выводим список продуктов
                    System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, Format.format(sumPerPerson));
                    // выводим сумму для оплаты на каждого человека
                    break;
                }

            } else {
                scanner.nextLine();
                System.out.println("Неверный ввод. Требуется ввести целое число или дсятичное.");

            }


            //System.out.println("Товар успешно добавлен.\nЖелаете добавить еще товар?");


        }
    }
}
