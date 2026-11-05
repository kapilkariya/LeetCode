class Solution {
    List<Integer> l=new ArrayList<>();
    public boolean checkPowersOfThree(int n) {
        for(int i=1;i<=n;i*=3) l.add(i);
        return dfs(n,0,0);
    }
    public boolean dfs(int n,int s,int i){
        if(s==n) return true;
        if(s>n || i>=l.size()) return false;
        return dfs(n,s+l.get(i),i+1) || dfs(n,s,i+1); 
    }
}