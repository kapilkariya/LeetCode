class Solution {
    public int kthGrammar(int n, int k) {
        return dfs(0,0,(int)Math.pow(2,n-1),n,k-1,1);
    }
    public int dfs(int x, int s,int e,int n,int k,int l){
        if(l==n) return x;
        int m=(s+e)/2;
        if(k>=s && k<m) {
            if(x==0) return dfs(0,s,m,n,k,l+1);
            else return dfs(1,s,m,n,k,l+1);
        }
        else{
            if(x==0) return dfs(1,m,e,n,k,l+1);
            else  return dfs(0,m,e,n,k,l+1);
        }
    }
}