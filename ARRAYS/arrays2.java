package ARRAYS;

public class arrays2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//
//        arr[0] = 10;
//        System.out.println(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + i;
            System.out.println(arr[i]);
        }

//        int[] arr1 = arr;
//        arr1[2] = 100;
//        System.out.println(arr[2]);
//        System.out.println(arr1[2]);
    }
}
