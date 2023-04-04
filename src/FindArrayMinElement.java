import java.util.Scanner;

public class FindArrayMinElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        System.out.println("Input Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element [%d][%d]", i, j);
                arr[i][j] = scanner.nextInt();
            }
        }
        int min = arr[0][0];
        System.out.println("Matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Array min value: " + min);
    }
}
