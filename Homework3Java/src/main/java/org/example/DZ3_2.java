package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class DZ3_2 {
    public static void main(String[] args) {
        TovarDZ2 tovar1 = new TovarDZ2("Мышка", "Америка", 3, 2, "первый");
        TovarDZ2 tovar2 = new TovarDZ2("Кошка", "Испания", 4, 3, "первый");
        TovarDZ2 tovar3 = new TovarDZ2("Собачка", "Бельгия", 5, 5, "второй");
        TovarDZ2 tovar4 = new TovarDZ2("Зайчик", "Австрия", 4, 3, "второй");
        TovarDZ2 tovar5 = new TovarDZ2("Хомячок", "Германия", 3, 1, "первый");
        TovarDZ2 tovar6 = new TovarDZ2("Свинка морская", "Франция", 4, 3, "второй");
        TovarDZ2 tovar7 = new TovarDZ2("Свинка сухопутная", "Россия", 7, 10, "первый");

        List<TovarDZ2> listTovar = new ArrayList<>();
        List<TovarDZ2> listTovar2 = new ArrayList<>();
        listTovar.add(tovar1);
        listTovar.add(tovar2);
        listTovar.add(tovar3);
        listTovar.add(tovar4);
        listTovar.add(tovar5);
        listTovar.add(tovar6);
        listTovar.add(tovar7);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сорт товаров, минимальную цену которых хоти получить (первый или второй): ");
        String needSort = scanner.next();
        int min = listTovar.get(6).getCena();

        for (int i = 0; i < listTovar.size(); i++) {
            if (listTovar.get(i).getSort().equals(needSort)){
                if (min > listTovar.get(i).getCena()) {
                    min = listTovar.get(i).getCena();
                }
            }
        }
        for (int i = 0; i < listTovar.size(); i++) {
            if ((listTovar.get(i).getCena() == min)&&(listTovar.get(i).getSort().equals(needSort))){
                listTovar2.add(listTovar.get(i));
            }
        }
        System.out.println("Самая низкая цена для этого сорта = " + min);
        for (int i = 0; i < listTovar2.size(); i++) {
            System.out.println(listTovar2.get(i).getName());
        }

    }
}
