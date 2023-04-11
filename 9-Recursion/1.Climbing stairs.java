//leetcode 70
class Solution {
    public int solve(int n,int[]dp){
        // base case
        if(n==0 || n==1)return 1;
        if(dp[n]!=0)return dp[n];
        dp[n]=solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        
        return solve(n,new int[n+1]);
    }
}

