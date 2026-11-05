class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> l=new ArrayList<>();
        String sb="";
        dfs(0,l,s,sb);
        return l;
    }
    public void dfs(int i,List<String> l, String s,String sb){
        if(i==s.length()){
            l.add(sb);
            return;
        }
        if((s.charAt(i)-'a'>=0 && s.charAt(i)-'a'<26)){
            dfs(i+1,l,s,sb+s.charAt(i));
            dfs(i+1,l,s,sb+(char)(s.charAt(i)-'a'+'A'));
        }
        else if(s.charAt(i)-'A'>=0 && s.charAt(i)-'A'<26){
            dfs(i+1,l,s,sb+s.charAt(i));
            dfs(i+1,l,s,sb+(char)(s.charAt(i)+'a'-'A'));
        }
        else{
            dfs(i+1,l,s,sb+s.charAt(i));
        }
    }
}