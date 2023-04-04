import java.util.Scanner;

public class RemoveArrayElement {
    public static void main(String[] args) {
        int[] arr = {5, 6, 8, 2, 3, 1, 2, 1, 5, 8, 9};
        for(int k : arr){
            System.out.print(k + "\t");
        }
        System.out.println();
        boolean exist = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number u want to remove: ");
        int number = scanner.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                System.out.println("Found number at index: "+ i);
                exist = true;
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j+1];
                }
                arr[arr.length-1] = 0;
                i--;
            }
        }
        System.out.printf("Array after %d removed: \n", number);
        for (int k: arr) {
            System.out.print(k + "\t");
        }
    }
}
