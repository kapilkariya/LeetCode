class Solution {
    public int sortPermutation(int[] nums) {
        int ans=-1;
        boolean a=false;
        for(int i=0;i<nums.length;i++) if(nums[i]!=i) ans&=nums[i];
        return Math.max(0,ans);
    }
}