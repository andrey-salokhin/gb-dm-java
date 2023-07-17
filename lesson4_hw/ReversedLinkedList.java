package lesson4_hw;

// 1) Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;

public class ReversedLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> ls = new LinkedList <Integer> ();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(getReversedLinkedList(ls));
    }

    public static LinkedList<Integer> getReversedLinkedList(LinkedList<Integer> ls) {

        LinkedList <Integer> reversedLinkedList = new LinkedList<Integer>();

        for (int i = ls.size(); i > 0; i--) {
            reversedLinkedList.add(ls.get(i-1));
        }
        return reversedLinkedList;
    }
}
