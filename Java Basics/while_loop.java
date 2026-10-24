import java.util.*;
public class while_loop {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        // int count = 1;
        // while (count<=n){
        //     System.out.print(count + " ");
        //     count++;
        // }
        int count = 1;
        int sum = 0;
        while (count <= n){
            sum = sum + count;
            count++;

        }
        System.out.println("The sum is: " + sum);
    }
    
}
