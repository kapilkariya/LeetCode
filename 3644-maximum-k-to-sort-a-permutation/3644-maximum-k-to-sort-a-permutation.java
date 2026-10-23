class Solution {
    public int sortPermutation(int[] nums) {
        int ans=0;
        boolean a=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i) {
                if(a){
                    ans=ans & nums[i];
                }
                else{
                    ans=nums[i];
                    a=true;
                }
            }
        }
        return ans;
    }
}