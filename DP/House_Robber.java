package DP;
public class House_Robber {
    public static void main(String[] args) {
        int[] nums = {5,1,3,7};

        int[] dp = new int[nums.length];
        for(int i = 0; i < dp.length; i++){
            dp[i] = -1;
        }  
        // or we can use Arrays.fill(dp, -1); to fill the array with -1
        System.out.println(rob(nums, 0));
        // System.out.println(robTD(nums, 0, dp));
        // System.out.println(robTDbackward(nums, nums.length - 1, dp));
        System.out.println(robBU(nums));
    }

    public static int robTD(int[] nums, int i, int[] dp){

        if(i >= nums.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + robTD(nums, i + 2, dp);   // dp[i+2]
        int notRob = robTD(nums, i + 1, dp);          // dp[i+1]
        return dp[i] = Math.max(rob, notRob);   

    }

    public static int robBU(int[] nums){
        int n = nums.length;
        if(n == 0) return 0;
        if(n == 1) return nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }
        return dp[n - 1];
    }

    public static int robTDbackward(int[] nums, int i, int[] dp){

        if(i < 0){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int rob = nums[i] + robTDbackward(nums, i - 2, dp);   
        int notRob = robTDbackward  (nums, i - 1, dp);       
        return dp[i] = Math.max(rob, notRob);   

    }

    public static int rob(int[] nums, int i){

        if(i >= nums.length){
            return 0;
        }
        int rob = nums[i] + rob(nums, i + 2);
        int notRob = rob(nums, i + 1);
        return Math.max(rob, notRob);   

    }
    
}
