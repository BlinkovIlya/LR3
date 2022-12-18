import java.util.Scanner;

public class Laba3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double array[] = new double[0];
        int i = 0;
        int g = 1;
        System.out.print("Введите число из массива: ");
        while (!in.hasNext("quit") & in.hasNextDouble()) {
            System.out.print("Введите число из массива: ");
            double array1[] = array;
            if (in.hasNextDouble()) {
                array = new double[g];
                array[i] = in.nextDouble();
                for (int k = 0; k < g - 1; k++) {
                    array[k] = array1[k];
                }
                g = g + 1;
                i++;
            }
        }
        for (double elem : array)
            System.out.print(elem + " ");
        System.out.println(" ");
        if (in.hasNext("quit")) {
            double sum = 0;
            for (int k = 0; k < g - 1; k++) {
                sum = sum + array[k];
                array[k] = sum / (k + 1);
            }
            System.out.println();
            for (double elem : array)
                System.out.print(elem + " ");
        }
    }

}
