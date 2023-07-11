// 2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package lesson2_hw;

import java.util.Arrays;
import java.util.logging.*;


public class LogSortArray {
    public static void main(String[] args) {

        int [] mas = {11, 3, 14, 16, 7};
        String file_path = System.getProperty("user.dir").concat("/log.txt");
        FileHandler fh = null;
        try {
            fh = new FileHandler(file_path, true);
        } catch (Exception e) {
               System.out.println("Error: " + e.getMessage());
        }
        
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            if(fh != null) {
                writeLog(mas, fh);
            }
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
                
            }
        }
    }

    public static void writeLog(int[] array, FileHandler fh) {
        Logger logger = Logger.getLogger(LogSortArray.class.getName());
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.info(Arrays.toString(array));
    }
}
