import java.util.*;

public class arrays1 {
    // public static void update_marks(int marks[]){

    //     for(int i =0; i<marks.length;i++){
    //         marks[i] = marks[i] +1;

    //     }
    // }
    // public static int get_largest(int marks[]){
    //     int largest =  Integer.MIN_VALUE;
    //     int smallest = Integer.MAX_VALUE;


    //     for(int i = 0; i<marks.length;i++){
    //         if(largest<marks[i]){
    //             largest= marks[i];
    //         }
    //         if(smallest>marks[i]){
    //             smallest = marks[i];

    //         }
    //     }
    //     System.out.println("smalest value is " + smallest);
    //     return largest;
    // }

    public static void printPairs(int numbers[]){
        int total_pairs=0;
        for(int i=0; i<numbers.length;i++){
            int curr = numbers[i];
            for(int j = i+1;j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                total_pairs++;

            }
            System.err.println();
        }
        System.err.println("total pairs "+total_pairs);
    }
    public static void main(String args[]){
        // int marks[]= {1,2,3,4,5,6,7,8};
        int numbers[] = {1,2,3,4,5};

        // update_marks(marks);
        // for (int i = 0 ; i<marks.length ; i++){
        //     System.out.print(marks[i] + " ");
        // }

        // System.out.println("largest value is " + get_largest(marks));

        printPairs(numbers);
    }
}

