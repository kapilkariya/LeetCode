class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> l=new ArrayList<>();
        int ans=0;
        for(int i=0;i<bank.length;i++){
            int ct=0;
            for(char c:bank[i].toCharArray()) if(c=='1') ct++;
            if(ct>0) l.add(ct); 
        }
        for(int i=0;i<l.size()-1;i++){
            ans+=(l.get(i)*l.get(i+1));
        }
        return ans;
    }
}