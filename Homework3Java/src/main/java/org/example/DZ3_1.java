package org.example;

import java.util.ArrayList;
import java.util.List;

public class DZ3_1 {
    public static void main(String[] args) {
        TovarDZ tovar1 = new TovarDZ(3, 6, "Клубника высший сорт");
        TovarDZ tovar2 = new TovarDZ(2, 5, "Черешня высший сорт");
        TovarDZ tovar3 = new TovarDZ(1, 3, "Вишня высший сорт");
        TovarDZ tovar4 = new TovarDZ(1, 4, "Клубника Воронежская");
        TovarDZ tovar5 = new TovarDZ(3, 3, "Черешня Воронежская");
        TovarDZ tovar6 = new TovarDZ(2, 1, "Вишня Воронежская");
        List<TovarDZ> listTovar = new ArrayList<>();
        listTovar.add(tovar1);
        listTovar.add(tovar2);
        listTovar.add(tovar3);
        listTovar.add(tovar4);
        listTovar.add(tovar5);
        listTovar.add(tovar6);
        int max = 0;
        for (int i = 0; i < listTovar.size(); i++) {
            if ((listTovar.get(i).getName().contains("высший")) && ((listTovar.get(i).getSort() == 1) || (listTovar.get(i).getSort() == 2))) {
                if (max < listTovar.get(i).getCena()){
                    max = listTovar.get(i).getCena();
                }
            }
        }
        System.out.println("Самая высокая цена = " + max);
    }
}
