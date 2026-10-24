import java.util.*;

public class LinearSearch {

    public static int linear_search(int marks[], int key){
        for(int i = 0;i<marks.length; i++){
            if (marks[i]==key){
                return i;
            }
        }

        return -1;
   }
    public static void main(String args[]){
        int marks[]= {1,2,3,4,5,6,7,8};
        Scanner sc =  new Scanner(System.in);
        int key = sc.nextInt();

        int index = linear_search(marks, key);
        if (index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index " + index);
        }
        System.out.println();
    }    
}

