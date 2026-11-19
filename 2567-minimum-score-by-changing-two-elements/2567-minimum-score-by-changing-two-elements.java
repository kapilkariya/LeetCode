class Solution {
    public int minimizeSum(int[] nums) {
        if(nums.length < 3) return 0;
        int mn1 = Integer.MAX_VALUE;
        int mn2 = Integer.MAX_VALUE;
        int mn3 = Integer.MAX_VALUE;
        int mx1 = Integer.MIN_VALUE;
        int mx2 = Integer.MIN_VALUE;
        int mx3 = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num < mn1) {
                mn3 = mn2;
                mn2 = mn1;
                mn1 = num;
            }
            else if(num < mn2) {
                mn3 = mn2;
                mn2 = num;
            }
            else if(num < mn3) {
                mn3 = num;
            }
            if(num > mx1) {
                mx3 = mx2;
                mx2 = mx1;
                mx1 = num;
            }
            else if(num > mx2) {
                mx3 = mx2;
                mx2 = num;
            }
            else if(num > mx3) {
                mx3 = num;
            }
        }
        return Math.min(mx1-mn3,Math.min(mx3-mn1,mx2-mn2));
    }
}