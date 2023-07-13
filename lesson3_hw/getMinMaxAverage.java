package lesson3_hw;

import static lesson3_hw.RemoveOddNumbers.generateRandomList;

import java.util.List;
import java.util.Collections;


public class getMinMaxAverage {
    public static void main(String[] args) {

        List <Integer> list = generateRandomList(10);
        Collections.sort(list);
        System.out.println("Min - " + list.get(0));
        System.out.println("Max - " + list.get(list.size()-1));
        System.out.println("Avg in list - " + list.get(list.size()/2));
        System.out.println("Avg from min and max - " + (double)(list.get(0) + list.get(list.size()-1)) / 2);
        System.out.println("Avg of numbers - " + getAverageFromList(list));
    }

    public static Double getAverageFromList(List<Integer> list) {
        int sum = getSumOfNumbers(list);
        return (double)sum / list.size();
    }

    public static Integer getSumOfNumbers(List<Integer> list) {
        int sum = 0;
        
        for (Integer el : list) {
            sum+=el;
        }

        return sum;
    }

}
