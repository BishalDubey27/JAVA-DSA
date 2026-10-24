package ARRAYS;

public class arrays3 {

    public static void swap(int a, int b) {
        System.out.println(a + "," + b);
        int temp = a;
        a = b;
        b = temp;
        
    }

    public static void swap(int[] a , int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(int[] one , int[] two){
        int[] temp = one;
        one = two;
        two = temp;
        System.out.println(one + "," + two);

    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};

        int i = 0;
        int j = 2;

        System.out.println(arr[i] + "," + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + "," + arr[j]);
        // System.out.println(arr[i] + "," + arr[j]);
        // swap(i, j);
        // System.out.println(arr[i] + "," + arr[j]);
        // swap(arr[i], arr[j]);
        // System.out.println(arr[i] + "," + arr[j]);
        

////        case2
//        swap(arr,i,j);
//        System.out.println(arr[i] + "," + arr[j]);

// //        case3
//         int[] other = {100,20,300};
//         System.out.println(arr[0] + "," + other[0]);
//         swap(arr,other);
//         System.out.println(arr[0] + "," + other[0]);

    }
}
