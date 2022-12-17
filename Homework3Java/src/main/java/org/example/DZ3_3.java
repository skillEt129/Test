package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DZ3_3 {
    public static void main(String[] args) {
        Book tovar1 = new Book("Гипперион", "Дэн Симмонс", 10, 2019, 499);
        Book tovar2 = new Book("Гадкий утенок", "Ганс Андерсон", 3, 2015, 197);
        Book tovar3 = new Book("Талисман", "Вальтер Скотт", 7, 2014, 397);
        Book tovar4 = new Book("Печальный детектив", "Виктор Астафьев", 2, 2008, 239);
        Book tovar5 = new Book("Мужество", "Анна Ахматова", 6, 2012, 110);
        Book tovar6 = new Book("Поэма без героя", "Анна Ахматова", 8, 2013, 337);

        List<Book> listBooks = new ArrayList<>();
        List<Book> listBoors2 = new ArrayList<>();
        listBooks.add(tovar1);
        listBooks.add(tovar2);
        listBooks.add(tovar3);
        listBooks.add(tovar4);
        listBooks.add(tovar5);
        listBooks.add(tovar6);
        String needName = "А";

        for (int i = 0; i < listBooks.size(); i++) {
            int kolvoStr = listBooks.get(i).getKolvo();
            int count = 0;
            for (int j = 2; j <  kolvoStr; j++) {
                if (kolvoStr%j == 0){
                    count ++;
                    continue;
                }
            }
            if (count == 0) {
                if ((listBooks.get(i).getName_autor().contains(needName)) && (listBooks.get(i).getYear() > 2010)) {
                    listBoors2.add(listBooks.get(i));
                }
            }
        }

        for (int i = 0; i < listBoors2.size(); i++) {
            System.out.println(listBoors2.get(i).getName_book());
        }

    }
}
