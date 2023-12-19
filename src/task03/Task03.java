package task03;

import java.util.Map;
import java.util.LinkedHashMap;

public class Task03 {

    public static void main(String[] args) {
        // Отримати початковий перелік контактів
        Map<String, String> initialMap = getMapInit();

        // Вивести початковий перелік контактів
        printMapInitial(initialMap);

        // Оновити та вивести оновлений перелік контактів
        updateAndPrintMap(initialMap);
    }

    // Метод для отримання початкового переліку контактів
    private static Map<String, String> getMapInit() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("Tom", "tom@mail.com");
        map.put("Lisa", "lisa@mail.com");
        map.put("Alice", "alisa@mail.com");
        map.put("Denis", "den@mail.com");

        return map;
    }

    // Метод для виведення початкового переліку контактів
    private static void printMapInitial(Map<String, String> map) {
        int count = 0;
        System.out.println("Initial contacts:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(++count + ") " + entry.getKey() + " - " + entry.getValue());
        }
    }

    // Метод для оновлення та виведення оновленого переліку контактів
    private static void updateAndPrintMap(Map<String, String> map) {
        // Оновити дані для контакту "Tom"
        map.replace("Tom", "tomasdev@glob.net");

        int updateCount = 0;
        System.out.println("\nUpdated contacts:");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(++updateCount + ") " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
