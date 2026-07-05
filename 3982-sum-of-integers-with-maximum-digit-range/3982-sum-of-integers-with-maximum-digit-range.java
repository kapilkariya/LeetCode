class Solution {
    public int maxDigitRange(int[] nums) {
        int ans=0;
        int n=-1;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            int s=Integer.MAX_VALUE;
            int l=Integer.MIN_VALUE;
            while(a>=1){
                s=Math.min(s,a%10);
                l=Math.max(l,a%10);
                a/=10;
            }
            if(n<l-s){
                n=l-s;
                ans=nums[i];
            }
            else if(n==l-s){
                ans+=nums[i];
            }
        }
        return ans;
    }
}