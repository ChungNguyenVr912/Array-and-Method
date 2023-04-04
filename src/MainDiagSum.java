import java.util.Scanner;

public class MainDiagSum {
    public static void main(String[] args) {
        int size;
        int[][] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter matrix size:");
            size = scanner.nextInt();
            if (size > 9)
                System.out.println("Size should not exceed 9");
        } while (size > 9);

        array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Enter element [%d][%d]", i, j);
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Inputted array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum += array[i][i];
        }
        System.out.print("Main diagonal sum: " + sum);
    }
}
