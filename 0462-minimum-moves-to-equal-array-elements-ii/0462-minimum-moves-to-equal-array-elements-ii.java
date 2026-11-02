class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int num:nums) ans+=(Math.abs(num-nums[nums.length/2]));
        return ans;
    }
}