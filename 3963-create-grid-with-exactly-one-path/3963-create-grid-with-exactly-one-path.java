class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        StringBuilder s=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<n-1;i++){
            s.append('#');
            s2.append('.');
        }
        s.append('.');
        s2.append('.');
        Arrays.fill(ans,s.toString());
        ans[0]=s2.toString();
        return ans;
    }
}