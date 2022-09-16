package collectionJava;

import java.util.List;

public class Bar {

    public static void main(String[] args) {
        ListOfPerson startList = new ListOfPerson();
        startList.addPerson("Максим")
                .addPerson("Ярик")
                .addPerson("Илья")
                .delPerson("Илья")
                .addPerson("Полина")
                .addPerson("Арина");
        if (!startList.findPerson("Катя")) {
            startList.addPerson("Катя");
        }

        List<String> whoMustCome = startList.getList();
        Donimator donimator = new Donimator(whoMustCome);
        donimator.donimatPerson();

        BarPerson whoMustPay = new BarPerson();
        for (int i = 0; i < whoMustCome.size(); i++) {
            whoMustPay.addPerson(whoMustCome.get(i), (int) (Math.random() * 10001));
        }
        whoMustPay.getPayList();
    }
}
