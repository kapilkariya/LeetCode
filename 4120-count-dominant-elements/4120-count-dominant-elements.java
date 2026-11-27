class Solution {
    public int countDominantElements(int[] nums) {
        int ct = 0;
        if(nums.length == 1) return 1;
        if(nums[0] >= nums[1]) ct++;
        if(nums[nums.length-1] >= nums[nums.length-2]) ct++;
        for(int i = 1; i < nums.length-1; i++) if(nums[i] >= ((nums[i+1] + nums[i-1]) / 2.0)) ct++;
        return ct;
    }
}