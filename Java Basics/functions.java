import java.util.*;
public class functions {

    public static void  printMyName(){
        System.out.println("My name is Bishal");
    }

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static int calculateProduct(int num1, int num2){
        int product = num1 * num2;
        return product;
    }

    public static int calculateFactorial(int num){
        int factorial = 1;
        if (num == 0){
            return 1;
        }
        for (int i = 1; i <= num; i++){
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int calculateBinomialCoefficient(int n, int r){
        int numerator = calculateFactorial(n);
        int denominator = calculateFactorial(r) * calculateFactorial(n - r);
        return numerator / denominator;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("The sum is: " + sum);
        int product = calculateProduct(a, b);
        System.out.println("The product is: " + product);
        int factorial = calculateFactorial(a);
        System.out.println("The factorial is: " + factorial);
        System.out.println(calculateFactorial(5));

        System.out.println(calculateBinomialCoefficient(5, 2));
    }
    
}
