class Solution {
    public int countVowelStrings(int n) {
        return dfs(n,5);   
    }
    public int dfs(int n ,int v){
        if(n==1) return v;
        int ct=0;
        for(int i=0;i<v;i++){
            ct+=(dfs(n-1,v-i));
        }
        return ct;
    }
}