package DP;

public class FibbonacciDP {

    public static int fibTopDownDP(int n, int[] dp) {

        if (n <= 1) {
            return n;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        return dp[n] = fibTopDownDP(n - 1, dp) + fibTopDownDP(n - 2, dp);
    }

    public static int fibBottomUpDP(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
    
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 50;
        int[] dp = new int[n + 1];

        System.out.println(fibTopDownDP(n, dp));
        System.out.println(fibBottomUpDP(n));
        System.out.println(fib(n));

    }
}