class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int ct=1;
        int ans=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+1)){
                ct++;
                ans=Math.max(ans,ct);
            }
            else if(nums[i]==nums[i-1]) {
                ct=ct;
            }
            else ct=1;
        }
        return ans;
    }
}