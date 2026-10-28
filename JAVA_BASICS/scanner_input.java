package JAVA_BASICS;
import java.util.*;
public class scanner_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int p = sc.nextInt();
        // int r = sc.nextInt();
        // int t = sc.nextInt();

        // int si = (p * r * t) / 100;
        // System.out.println("Simple Interest is: " + si);

        // int n = sc.nextInt();
        // if(n % 2 == 0) {
        //     System.out.println(n + " is an even number.");
        // } else {
        //     System.out.println(n + " is an odd number.");
        // }


        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is the largest number.");
        } else if(n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is the largest number.");
        } else {
            System.out.println(n3 + " is the largest number.");
        }
    }
}
