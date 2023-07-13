package lesson3_hw;

import java.util.ArrayList;
import java.util.List;

public class RemoveOddNumbers {

    public static void main(String[] args) {

        List<Integer> list = generateRandomList(10);

        System.out.println(list);

        for (int i = 0; i < list.size();) {
            if (list.get(i) % 2 != 0) {
                list.remove(i);
            } else {
                i++;
            }
        }

        System.out.println(list);

    }

    public static List<Integer> generateRandomList(Integer quantity) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < quantity; i++) {
            list.add((int) (Math.random() * 100));
        }

        return list;
        
    }

}
