package DP;

public class Climbing_Stairs {
    public static void main(String[] args) {
        int[] nums = {10,15,20};
        // int n = nums.length;
        // int[] dp = new int[n + 1];
        // for(int i = 0; i < dp.length; i++){
        //     dp[i] = -1;
        // }
        // int zero = minCostClimbingStairs(nums, 0, dp);
        // int one = minCostClimbingStairs(nums, 1, dp);
        // System.out.println(Math.min(zero, one));
        System.out.println(minCostBU(nums));
     
    }

    public static int minCostBU(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i <= n; i++) {
            int takeOneStep = dp[i - 1];
            int takeTwoSteps = dp[i - 2];
            dp[i] = Math.min(takeOneStep, takeTwoSteps) + nums[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }

    public static int minCostClimbingStairs(int[] nums, int i, int[] dp) {
        if (i >= nums.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int takeOneStep = minCostClimbingStairs(nums, i - 1, dp) ;
        int takeTwoSteps = minCostClimbingStairs(nums, i - 2, dp);
        return dp[i] = Math.min(takeOneStep, takeTwoSteps);
    }
}
