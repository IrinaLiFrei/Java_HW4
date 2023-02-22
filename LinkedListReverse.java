// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список. 
// Постараться не обращаться к листу по индексам.

package Java_HW4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListReverse {
    
    public static void main(String[] args) {
        int number = 10;
        LinkedList<Integer> lList = getLinkedList(number);
        System.out.println(lList);
        Collections.reverse(lList);
        System.out.println(lList);
    }
    
    static LinkedList<Integer> getLinkedList(int num){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < num; i++) {
            list.addFirst(i);
        }
        return list;
    }
}

