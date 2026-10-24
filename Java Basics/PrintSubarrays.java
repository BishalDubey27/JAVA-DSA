// array may or may not be in sorted form

import java.util.*;
public class PrintSubarrays {
    public static void printSubarrays(int numbers[]){

        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
         
    }
    
    public static void printMaxSubarraySum(int numbers[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;




        for(int i =0; i<numbers.length;i++){
            for(int j=i; j<numbers.length; j++){
                currSum = 0;
                for(int k=i;k<=j;k++){
                    // subarray sum

                currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.err.println("max sum is " + maxSum);
         
    }

    
    public static void printMaxSubarrayPrefixSum(int numbers[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1; i<prefix.length;i++){
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum is " + maxSum);
         
    }

    public static void kadane_algo(int numbers[]){

        
    }

    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        // printSubarrays(numbers);
        // printMaxSubarraySum(numbers);
        printMaxSubarrayPrefixSum(numbers);
    }
    
}
