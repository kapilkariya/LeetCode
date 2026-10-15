class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
            boolean[] arr=new boolean[101];
            int ct=0;
            for(int j=i;j<nums.size();j++){
                if(!arr[nums.get(j)]){
                    arr[nums.get(j)]=true;
                    ct++;
                }
                ans+=(ct*ct); 
            }
        }
        return ans;
    }
}