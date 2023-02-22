// 2) Реализуйте очередь с помощью LinkedList со следующими методами: 
// enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

package Java_HW4;

import java.util.LinkedList;

public class LListEnqueuDequeueFirst {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        System.out.println("Заданный список: " + list);
        enqueue(list, 1);
        System.out.printf("Enqueue() - помещает элемент в конец очереди: %s\n", list);
        System.out.printf("Dequeue() - возвращает 1-й эл из очереди и удаляет его: %d (%s)\n", dequeue(list), list);
        System.out.printf("First() - возвращает 1-й эл из очереди, не удаляя: %d (%s)\n", first(list), list);
    }

    static void enqueue(LinkedList<Integer> ll, int num){
       ll.addLast(num);
    }

    static int dequeue(LinkedList<Integer> ll) {
        int num = 0;
        num = ll.get(0);
        ll.remove(0);
        return num;
    }

    static int first(LinkedList<Integer> ll) {
        int num = 0;
        num = ll.get(0);
        return num;
    }
}

