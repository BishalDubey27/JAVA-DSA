package ARRAYS;

public class MinElement {
    static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        display(arr);
        minElement(arr);
        maxElement(arr);
    }
    public static void display(int[] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void minElement(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++){
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("minimum element is " + min);

    }

    public static void maxElement(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum element is " + max);
    }
}
