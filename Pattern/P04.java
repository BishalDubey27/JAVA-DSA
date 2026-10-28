package Pattern;
import java.util.*; 
public class P04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n - 1;
        while(row <= n) {
            // space printing logic
            int i = 1;
            while(i <= space) {
                System.out.print(" ");
                i++;
            }

            // star printing logic
            int j = 1;
            while(j <= star) {
                System.out.print("*");
                j++;
            }
            
            // next row preparation
            star++; 
            space--;
            System.out.println();
            row++;
        }
    }
}
