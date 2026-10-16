class Solution {
    static {
        System.out.close();
    }
    public List<String> validStrings(int n) {
        List<String> l=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        dfs(n,s,l);
        return l;
    }
    public void dfs(int n,StringBuilder s,List<String> l){
        if(n==0) {
            l.add(s.toString());
            return;
        }
        if(n==1){
            s.append('1');
            dfs(n-1,s,l);
            s.deleteCharAt(s.length() - 1);
            s.append('0');
            dfs(n-1,s,l);
            s.deleteCharAt(s.length() - 1);
        }
        else{
            s.append('1');
            dfs(n-1,s,l);
            s.deleteCharAt(s.length() - 1);
            s.append("01");
            if(n>1) dfs(n-2,s,l);
            s.deleteCharAt(s.length() - 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
}