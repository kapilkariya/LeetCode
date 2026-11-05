class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int ans=0;
        for(int i=0;i<satisfaction.length;i++){
            int x=1;
            int sum=0;
            for(int j=i;j<satisfaction.length;j++){
                sum+=(satisfaction[j]*(x++));
            }
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}