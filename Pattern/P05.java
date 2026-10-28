package Pattern;
import java.util.*; 
public class P05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = 0;
        while(row <= n) {
            // space printing logic
            int i = 1;
            while(i <= space) {
                System.out.print("  ");
                i++;
            }

            // star printing logic
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            
            // next row preparation
            star = star - 1; 
            space = space + 2;
            System.out.println();
            row++;
        }
    }
}
