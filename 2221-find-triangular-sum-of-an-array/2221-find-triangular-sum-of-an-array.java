class Solution {
    public int triangularSum(int[] nums) {
        int j=0;
        while(j<nums.length-1){
            for(int i=0;i<nums.length-j-1;i++) nums[i]=(nums[i]+nums[i+1])%10;
            j++;
        }
        return nums[0];
    }
}