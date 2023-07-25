package lesson6_hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Notebook nb1 = new Notebook();
        nb1.brand = "Asus";
        nb1.model = "b1";
        nb1.color = "black";
        nb1.ram = "8";
        nb1.os = "win";
        nb1.ssd = "512";

        Notebook nb2 = new Notebook();
        nb2.brand = "MSU";
        nb2.model = "a1";
        nb2.color = "white";
        nb2.ram = "16";
        nb2.os = "linux";
        nb2.ssd = "256";

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
