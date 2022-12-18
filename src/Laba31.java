import java.util.Scanner;
public class Laba31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[0];
        int i = 0;
        int g = 1;
        int excep = 0;
        System.out.print("Введите число для удаления: ");
        if (in.hasNextInt()) {
            excep = in.nextInt();
            System.out.print("Введите число из масссива: ");
        } else {
            System.out.println("Необходимо ввести разные число и массив!");
        }
        if (in.hasNextInt()) {
            while (!in.hasNext("quit") & in.hasNextInt()) {
                System.out.print("Введите число из масссива: ");
                int array1[] = array;
                if (in.hasNextInt()) {
                    array = new int[g];
                    array[i] = in.nextInt();
                    for (int k = 0; k < g - 1; k++) {
                        array[k] = array1[k];
                    }
                    g = g + 1;
                    i++;
                }
            }
            for (int elem : array)
                System.out.print(elem + " ");
            System.out.println(" ");
            if (in.hasNext("quit")) {
                int p = 1;
                i = 0;
                int array2[] = new int[0];
                for (int k = 0; k < g - 1; k++) {
                    if (array[k] != excep) {
                        int array1[] = array2;
                        array2 = new int[p];
                        array2[i] = array[k];
                        for (int z = 0; z < p - 1; z++) {
                            array2[z] = array1[z];
                        }
                        p = p + 1;
                        i++;
                    }
                }
                for (int elem : array2)
                    System.out.print(elem + " ");
            }
        }
    }
}
