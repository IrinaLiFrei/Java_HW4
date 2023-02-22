// 3)Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

package Java_HW4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class LListElsSumWithIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of list elements: ");
        int number = sc.nextInt();
        LinkedList<Integer> ll = getRandomList(number);
        System.out.println(ll);
        System.out.println(getSum(ll));
        sc.close();
    }
    
    static LinkedList<Integer> getRandomList(int num){
        LinkedList<Integer> linkedList = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < num; i++) {
            linkedList.add(rand.nextInt(0, 10));
        }
        return linkedList;
    }
static int getSum(LinkedList<Integer> ll){
    int sum = 0;
    Iterator<Integer> it = ll.iterator();
    while (it.hasNext()){
        sum += it.next();
    }
    return sum;
    } 
}
