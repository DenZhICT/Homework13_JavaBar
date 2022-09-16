package collectionJava;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Donimator {
    public HashSet<String> notInBar;

    public Donimator(List<String> mustBeInBar) {
        this.notInBar = new HashSet<>(mustBeInBar);
    }

    public void donimatPerson() {
        Scanner sc = new Scanner(System.in);
        String checker;
        for (String person : notInBar) {
            do {
                System.out.println(person + " уже в баре?\nЧтобы остановить спам, напишите 'Yes'");
                checker = sc.nextLine();
            } while (!checker.equals("Yes"));
            System.out.println(person + " молодец!");
        }
        sc.close();
    }

}
