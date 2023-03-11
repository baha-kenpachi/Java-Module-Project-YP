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
            listProducts = listProducts + "\n" + productName;

            System.out.println("Напишите цену на блюдо:");
            double productCost = scanner.nextDouble();
            sum = sum + productCost; // суммируем стоимость товаров

            //Product productObject = new Product(productName, productCost); // создаём обект с полями название продукта и цены
            System.out.println("Товар успешно добавлен");

            System.out.println("Желаете добавить еще товар?");
            String requestion = scanner.next();

            if (requestion.equalsIgnoreCase("Завершить")) {

                sumPerPerson = sum / quantityPeople;

                System.out.println(listProducts);
                System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, Formater.formater(sumPerPerson));
                break;
            }
        }
    }
}
