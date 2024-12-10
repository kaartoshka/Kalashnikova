import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.InputMismatchException;

public class WarehouseApp {
    private static Map<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inventory.put("Product A", 100);
        inventory.put("Product B", 50);

        while (true) {
            System.out.println("1. Добавить товар");
            System.out.println("2. Продать товар");
            System.out.println("3. Показать доступные товары");
            System.out.println("4. Группировка товаров");
            System.out.println("0. Выход");
            System.out.print("> ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Пожалуйста, введите целое число.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:

                    break;
                case 2:
                    sellProduct(scanner);
                    break;
                case 3:
                    showAvailableProducts();
                    break;
                case 4:
                    showGroupedProducts();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    private static void sellProduct(Scanner scanner) {
        System.out.print("Введите имя товара: ");
        String productName = scanner.nextLine();
        System.out.print("Введите количество: ");
        int quantity;

        try {
            quantity = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите корректное количество.");
            scanner.next();
            return;
        }

        System.out.print("Введите имя покупателя: ");
        String buyerName = scanner.nextLine();

        if (inventory.containsKey(productName)) {
            int currentStock = inventory.get(productName);
            if (currentStock >= quantity) {
                inventory.put(productName, currentStock - quantity);
                System.out.println("Sold " + quantity + " of " + productName + " to " + buyerName);
            } else {
                System.out.println("Not enough stock for " + productName);
            }
        } else {
            System.out.println("Product not found");
        }
    }

    private static void showAvailableProducts() {
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void showGroupedProducts() {
        System.out.println(inventory);
    }
}
