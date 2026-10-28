package Pattern;

public class P10 {
    public static void main(String[] args) {
        int n = 5;
        int row = 1;
        int star = 1;
        while(row <= 2*n - 1) {
          

            // star printing logic
            int j = 1;
            while(j <= star) {
                System.out.print("* ");
                j++;
            }
            
            // next row preparation
            star++; 
            System.out.println();
            row++;
        }
    }
    
}
