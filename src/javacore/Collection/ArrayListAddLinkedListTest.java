package javacore.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAddLinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(4);
        removeEvenVer2(list);
        for(Integer x : list){
            System.out.println(x);
        }



    }
    public static void removeEvenVer2(List<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%2 == 0){
                iterator.remove();
            }
        }
    }
}
