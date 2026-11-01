class Solution {
    public int minMoves(int[] nums) {
        int mn=Integer.MAX_VALUE;
        int ans=0;
        for(int num:nums) if(mn>num) mn=num;
        for(int num:nums) ans+=(num-mn);
        return ans;
    }
}