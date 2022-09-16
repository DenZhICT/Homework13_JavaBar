package collectionJava;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ListOfPerson {
    private TreeSet<String> list = new TreeSet<>();

    public ListOfPerson addPerson(String person) {
        list.add(person);
        return this;
    }

    public ListOfPerson delPerson(String person) {
        list.remove(person);
        return this;
    }

    public boolean findPerson(String person) {
        return list.contains(person);
    }

    public List<String> getList() {
        List<String> arrayList = new ArrayList<>();
        System.out.println("В бар идут:");
        while (!list.isEmpty()) {
            String firstName = list.first();
            arrayList.add(firstName);
            System.out.println(firstName);
            list.remove(firstName);
        }
        return arrayList;
    }
}
