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
            } else if (quantityPeople > 1) { //начинаем собирать название товаров и цены пока не будет команды завершить
                calculate(quantityPeople);
                return;
            }
        }
    }

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
                System.out.printf("Каждый человек должен заплатить: %.2f %s.", sumPerPerson, formater(sumPerPerson));
                break;
            }
        }
    }
    public static String formater(double formaterring){ // formatter возвращет рубль в правильной форме
        String rub = null;
        if (Math.floor(formaterring) == 1 ){
            rub = "рубль";
        } else if (Math.floor(formaterring) > 1 && Math.floor(formaterring) < 5){
            rub = "рубля";
        } else {
            rub = "рублей";
        }
        return rub;
    }
}
