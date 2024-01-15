package hw_15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListNumber {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);


        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(2);
        list2.add(3);
        list2.add(8);

        System.out.println("list1");
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            int nextNumber =iterator.next();
            System.out.println(nextNumber);



        System.out.println("list2");
        Iterator<Integer> numbers2 = list2.iterator();
        System.out.println(numbers2.next());




        }



    }
}
