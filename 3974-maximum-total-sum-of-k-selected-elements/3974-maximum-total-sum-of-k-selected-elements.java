class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++){
            if(mul>1) sum+=(long)((long)nums[nums.length-1-i]*(long)mul--);
            else sum+=nums[nums.length-1-i];
        }
        return sum;
    }
}