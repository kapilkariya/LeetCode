class Solution {
    public int countVowelStrings(int n) {
        int[][] dp=new int[n+1][6];
        return dfs(n,5,dp);   
    }
    public int dfs(int n ,int v,int[][] dp){
        if(dp[n][v]!=0) return dp[n][v];
        if(n==1) return v;
        int ct=0;
        for(int i=0;i<v;i++){
            ct+=(dfs(n-1,v-i,dp));
        }
        dp[n][v]=ct;
        return ct;
    }
}