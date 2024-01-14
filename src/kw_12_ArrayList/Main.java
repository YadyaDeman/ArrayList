package kw_12_ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    /*Задача 1
Разобраться в коде занятия (our arraylist).
В классе Main создать несколько обьектов OurArrayList, вызвать методы, посмотреть как они работают

Задача 2*
Написать тесты к методам класса OurArrayList*/
    public static void main(String[] args) {
        int[] masiv = {2, 1, 5, 4, 3, 6, 10, 0};
        for (int element : masiv)
            System.out.println(element);

        OurArrayList<Integer> ourList = new OurArrayList<>();
        System.out.println(ourList.get(6));
        System.out.println(ourList.get(3));


        OurArrayList<Integer> ourList1 = new OurArrayList<>();
        System.out.println("Size - " + ourList.size());

        System.out.println("Remove - " + ourList1.remove(4));


    }

    @Test
    public void ourList_size() {
        int[] masiv = {2, 1, 5, 4, 3, 3, 8};
        assertEquals(7, masiv.length);
    }
}