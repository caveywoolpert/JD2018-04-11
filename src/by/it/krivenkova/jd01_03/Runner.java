package by.it.krivenkova.jd01_03;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String line = scanner.nextLine();
       double[] array = InOut.getArray(line);
        System.out.println("Simple format");
        InOut.printArray(array);
        System.out.println("Formatted output");
        InOut.printArray(array, "V",3);


        System.out.println("Sorted array");
        Helper.sort(array);
        InOut.printArray(array);

        double min = Helper.findMin(array);
        System.out.println("Minimum = " + min);

        double max = Helper.findMax(array);
        System.out.println("Maximum = " + max);


    }
}
