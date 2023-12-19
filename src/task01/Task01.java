package task01;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task01 {

    public static void main(String[] args) {
        Map<String, String> initialMap = getMapInit();
        printMapInitial(initialMap);
        updateAndPrintMap(initialMap);
    }

    private static Map<String, String> getMapInit() {
        Map<String, String> map = new HashMap<>();

        map.put("orange", "12 kg");
        map.put("banana", "25 kg");
        map.put("lemon", "8 kg");
        map.put("pineapple", "13 kg");
        map.put("grape", "9 kg");

        return map;
    }

    private static void printMapInitial(Map<String, String> map) {
        AtomicInteger count = new AtomicInteger(0);
        System.out.println("Initial data:");
        map.forEach((key, value) -> System.out.println(count.incrementAndGet() + ") " + key + ", " + value));
    }

    private static void updateAndPrintMap(Map<String, String> map) {
        // Оновлення даних
        map.put("banana", "14 kg");
        map.put("plum", "15 kg");

        AtomicInteger updateCount = new AtomicInteger(0);
        System.out.println("\nUpdated data:");
        map.forEach((key, value) -> System.out.println(updateCount.incrementAndGet() + ") " + key + ", " + value));
    }
}
