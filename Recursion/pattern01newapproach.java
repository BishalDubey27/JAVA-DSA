public class pattern01newapproach {

    public static void main(String[] args) {
        f(1,1,5);
    }

    public static void f(int row, int col, int n){
        if(row>n) return;
        if(col>n){
            System.out.println();
            f(row+1,1,n);
            return;
        }
        System.out.print("*");
        f(row, col+1, n);
    }
    public static void printStars(int n){
        for(int i=0; i<n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

// for the below pattern 
// *
// **
// ***
// ****
// just change the if (col>n) to if(col>row) in the above code.

// for the below pattern 
// ****
// ***
// **
// *
// just change the if (col>n) to if(col>n-row+1) in the above code.