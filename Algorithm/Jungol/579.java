// For Algorithm submit template
import java.util.Scanner;


class Main {
    public static int[] sort(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j!=i && j  < arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i =0; i<n;i++){
            arr[i] = scanner.nextInt();
        }

        arr = sort(arr);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        scanner.close();
    }
}