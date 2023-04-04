public class MergerArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 4, 8, 3, 12, 5, 9, 7, 6};
        int[] arr2 = {55, 6, 32, 23, 5, 9, 8, 5, 15, 26};
        int l1 = arr1.length;
        int l2 = arr2.length;
        int[] arr3 = new int[l1 + l2];
        for(int i = 0; i < l1; i++){
            arr3[i] = arr1[i];
        }
        for(int i = 0; i < l2; i++){
            arr3[i + l1] = arr2[i];
        }
        System.out.print("Array 1: ");
        for(int k : arr1){
            System.out.print(k + "\t");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for(int k : arr2){
            System.out.print(k + "\t");
        }
        System.out.println();
        System.out.println("Array 1 merger with array 2:");
        for(int k : arr3){
            System.out.print(k + "\t");
        }
    }
}
