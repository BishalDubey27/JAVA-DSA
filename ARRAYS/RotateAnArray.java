package ARRAYS;
import java.util.*;
public class RotateAnArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter array element: ");
        for (int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter K: ");
        int k = sc.nextInt();

        // Reduce unnecessary rotations
        k = k % n;

        // Convert negative K into equivalent right rotation
        if (k < 0) {
            k = k + n;
        }

    display(arr);
    rotateArray(arr,k);
    display(arr);

}

public static void display(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}

public static void rotateArray(int[] arr, int k) {
    for (int j = 0; j < k; j++) {

            int last = arr[arr.length - 1];

            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }

            arr[0] = last;
        }
    }
    }

