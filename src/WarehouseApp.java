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
            System.out.println("1. �������� �����");
            System.out.println("2. ������� �����");
            System.out.println("3. �������� ��������� ������");
            System.out.println("4. ����������� �������");
            System.out.println("0. �����");
            System.out.print("> ");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("����������, ������� ����� �����.");
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
                    System.out.println("����� �� ���������.");
                    return;
                default:
                    System.out.println("������������ �����. ���������� �����.");
            }
        }
    }

    private static void sellProduct(Scanner scanner) {
        System.out.print("������� ��� ������: ");
        String productName = scanner.nextLine();
        System.out.print("������� ����������: ");
        int quantity;

        try {
            quantity = scanner.nextInt();
            scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("����������, ������� ���������� ����������.");
            scanner.next();
            return;
        }

        System.out.print("������� ��� ����������: ");
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
