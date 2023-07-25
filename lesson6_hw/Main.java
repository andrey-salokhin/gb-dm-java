package lesson6_hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Notebook nb1 = new Notebook("Asus", "b1", "black", "8", "win", "512");
        Notebook nb2 = new Notebook("MSU", "a1", "white", "16", "linux", "256");

        Set <Notebook> notebooks = new HashSet<>();
        notebooks.add(nb1);
        notebooks.add(nb2);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write your filter criteria (press enter to skip)");
        System.out.println("Minimum RAM");
        String selectedRam = sc.nextLine();
        System.out.println("Minimum SSD");
        String selectedSsd = sc.nextLine();
        System.out.println("OS");
        String selectedOs = sc.nextLine();
        System.out.println("Color");
        String selectedColor = sc.nextLine();
        sc.close();

        for (Notebook notebook : notebooks) {
            if(notebook.filterNotebook(selectedRam, selectedSsd, selectedOs, selectedColor)){
                System.out.println(notebook.toString());
            }
           
        }
    }
}
