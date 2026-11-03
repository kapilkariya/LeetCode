class Solution {
    public int minMoves(int[] nums) {
        int mx=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums) {
            if(num>mx) mx=num;
            sum+=num;
        }
        return (mx*nums.length)-sum;
    }
}