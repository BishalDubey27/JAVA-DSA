public class demo2DArray {
    public static void main(String[] args) {
        int[][] a = new int[3][4];

        int[][] a1 = {
                { 1, 2 },
                { 3, 4 },
                { 5, 6 }
        };
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a1[1][1]);
        System.out.println(a1[0].length);


        a[1][1] = 100;
        System.out.println(a[1][1]);

        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[0].length; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }


        for (int[] val : a1) {
            for (int temp : val) {
                System.out.print(temp + " ");

            }
            System.out.println();

        }
    }
}