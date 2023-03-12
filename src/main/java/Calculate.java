import java.util.Scanner;

public class Calculate {
    static Scanner scanner = new Scanner(System.in);

    public static void calculate(int quantityPeople) {
        double sum = 0;
        double sumPerPerson = 0;
        String listProducts = "Добавленные товары:";

        boolean finished = false;
        while (!finished) {
            System.out.println("Напишите название блюда:");
            String productName = scanner.next();


            boolean priceInpuitFinished = false;
            while(!priceInpuitFinished) {
                System.out.println("Напишите цену на блюдо:");
                if (scanner.hasNextDouble())
                {
                    double input = scanner.nextDouble();
                    if (input < 0)
                    {
                        inCorrectInput();
                        continue;
                    }
                    listProducts = listProducts + "\n" + productName; // собираем список продуктов
                    sum += input;  //общая стоимость
                    priceInpuitFinished = true;
                } else {
                    inCorrectInput();
                    continue;
                }
            }
            System.out.println("Товар успешно добавлен.\nЖелаете добавить еще товар?");
            String requestion = scanner.next(); // продолжает работу при вводе любого символа или текста

            if (requestion.equalsIgnoreCase("Завершить")) { // при вводе завершить, программа останавливает работу
                sumPerPerson = sum / quantityPeople; // делим общий счет на количество людей
                // выводим сумму для оплаты на каждого человека
                finished = true;
            }
        }
        System.out.println(listProducts); // выводим список продуктов
        System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, Format.format(sumPerPerson));


    }

    public static void calculate2(int quantityPeople) { // без учета отрицательного ввода
        double sum = 0;
        double sumPerPerson;
        String listProducts = "Добавленные товары:";

        while (true) {
            System.out.println("Напишите название блюда:");
            String productName = scanner.next();
            //listProducts = listProducts + "\n" + productName; // собираем список продуктов

            System.out.println("Напишите цену на блюдо:");
            double productCost = 0;

            while (true) {
                if (scanner.hasNextDouble()) {

                    productCost = scanner.nextDouble();
                    listProducts = listProducts + "\n" + productName; // собираем список продуктов
                    sum += productCost; // суммируем стоимость товаров
                    System.out.println("Товар успешно добавлен.\nЖелаете добавить еще товар?");

                    String requestion = scanner.next(); // продолжает работу при вводе любого символа или текста

                    if (requestion.equalsIgnoreCase("Завершить")) { // при вводе завершить, программа останавливает работу

                        sumPerPerson = sum / quantityPeople; // делим общий счет на количество людей

                        System.out.println(listProducts); // выводим список продуктов
                        System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, Format.format(sumPerPerson));
                        // выводим сумму для оплаты на каждого человека
                        return;
                    }
                    break;

                } else {
                    scanner.next();
                    System.out.println("Неверный ввод. Требуется ввести целое число или дсятичное.");

                }
            }
        }
    }
    public static void inCorrectInput (){
        scanner.nextLine();
        System.out.println("Неверный ввод. Требуется ввести целое число или дсятичное.");

    }
}
