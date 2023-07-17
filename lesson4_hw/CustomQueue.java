package lesson4_hw;

// 2) Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class CustomQueue {

    LinkedList<Integer> ls;

    public CustomQueue() {
        ls = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        CustomQueue cq = new CustomQueue();
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        System.out.println(cq.getLinekdList());
        cq.dequeue();
        System.out.println(cq.getLinekdList());
        System.out.println(cq.first());
        System.out.println(cq.getLinekdList());
    }

    public void enqueue(int number) {
        ls.add(number);
    }

    public int dequeue() {
        int number = ls.getFirst();
        ls.removeFirst();
        return number;
    }

    public int first() {
        return ls.getFirst();
    }

    public LinkedList<Integer> getLinekdList() {
        return ls;
    }
}
