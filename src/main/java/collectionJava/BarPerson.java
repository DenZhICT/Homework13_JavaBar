package collectionJava;

import java.util.HashMap;
import java.util.Map;

public class BarPerson {
    private HashMap<String, Integer> goToBar = new HashMap<>();

    public void addPerson(String name, int bill) {
        goToBar.put(name, bill);
    }

    public void getPayList() {
        System.out.println("Имя - Счёт");
        int sum = 0;
        for (Map.Entry<String, Integer> entry : goToBar.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            sum += entry.getValue();
        }
        System.out.println("Итог: " + sum);
    }
}
