public class FindArray2DMaxValue {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int max = 0;
        System.out.println("Matrix:");
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                arr[i][j] = (int)(Math.random()*99);
                if (arr[i][j] > max){
                    max = arr[i][j];
                }
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matrix max value: " + max);
    }
}
