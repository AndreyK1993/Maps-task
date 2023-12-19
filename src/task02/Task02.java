package task02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        // Отримати дані про товари
        Map<String, Integer> inventory = getData();

        // Отримати введення користувача щодо найменування товару
        String productName = getUserInput();

        // Отримати та вивести інформацію про товар
        String result = getProductInfo(productName, inventory);
        displayResult(result);
    }

    // Метод для отримання початкових даних про товари .
    private static Map<String, Integer> getData() {
        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Laptop", 5);
        inventory.put("Phone", 10);
        inventory.put("Headphones", 15);
        inventory.put("Camera", 8);
        inventory.put("Printer", 3);
        return inventory;
    }

    // Метод для отримання введення користувача
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name: ");
        return scanner.nextLine().trim();
    }

    // Метод для отримання та форматування інформації про товар
    private static String getProductInfo(String productName, Map<String, Integer> inventory) {
        Integer quantity = inventory.get(productName);
        if (quantity != null) {
            return productName + " = " + quantity;
        } else {
            return productName + " not found!";
        }
    }

    // Метод для виведення результату
    private static void displayResult(String result) {
        System.out.println(result);
    }
}
