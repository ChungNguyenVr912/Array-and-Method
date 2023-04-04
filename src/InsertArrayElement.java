import java.util.Scanner;

public class InsertArrayElement {
    public static void main(String[] args) {
        int[] arr = {5, 9, 6, 8, 7, 4, 2, 6, 0, 0};
        System.out.print("Give array: ");
        for(int k: arr){
            System.out.print(k + "\t");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter insert number: ");
        int number = scanner.nextInt();
        int index;
        do {
            System.out.print("Enter insert index: ");
            index = scanner.nextInt();
        }while(index < 0 || index > arr.length-1);
        for(int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        System.out.println("Array after insert:");
        for(int k: arr){
            System.out.print(k + "\t");
        }
    }
}
