public class matmul {
    public static void main(String[] args) {
        int[][] m1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] m2 = {
                { 1, 1 },
                { 1, 2 },
                {2, 1 }
        };

        int[][] product = matmultiply(m1, m2);
        matDisplay(product);
    }
    

    public static int[][] matmultiply(int[][] A, int[][] B) {
        int R1 = A.length;
        int C1 = A[0].length;
        int R2 = B.length;
        int C2 = B[0].length;

        if (C1 != R2) {
            System.out.println("Incompatible matrix dimensions");
            return null;
        }

        int[][] ans = new int[R1][C2];

        for (int i = 0; i < R1; i++) {
            for (int j = 0; j < C2; j++) {
                int sum = 0;
                for (int k = 0; k < C1; k++) {
                    sum += A[i][k] * B[k][j];
                }
                ans[i][j] = sum;
            }
        }
        return ans;
    }

    public static void matDisplay(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
