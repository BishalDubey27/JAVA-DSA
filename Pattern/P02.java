package Pattern;
import java.util.*; 
public class P02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        while(row <= n) {

            // star printing logic
            int i = 1;
            while(i <= star) {
                System.out.print("* ");
                i++;
            }
            // next row preparation
            star++;
            System.out.println();
            row++;
        }
    }
}
