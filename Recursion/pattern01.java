import java.util.Scanner;

public class pattern01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalStars = n;
        f(n,totalStars);


        sc.close();
    }

    public static void f(int n, int totalStars){
        if(n <=0){
            return;
        }else{
            printStars(totalStars);
            f(n-1, totalStars);
        }
    }
    public static void printStars(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}