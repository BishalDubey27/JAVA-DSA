import java.util.*;
public class for_loop {
    public static void main(String[] args){
        int n = 5;
        int sum = 0;
        for (int count = 1; count <= n; count++){
            sum = sum + count;
        }
        System.out.println("The sum is: " + sum);

        for (int i = 1; i <=10 ; i++){
            System.out.println("hello world");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int lastDigit;
        while (num>0){
            lastDigit = num % 10;
            System.out.print(lastDigit);
            num = num / 10;

        }
        int number = 10899;
        int rev = 0;
        int last_digit;
        while (number>0){
            last_digit = number % 10;
            rev = rev*10 + last_digit;
            number = number / 10;
    }   System.out.println("The reverse of the number is: " + rev);
    
}
}