class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int ct=0;
        int t=0;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) ct++;
            if(nums[i]==target) t++;
        }
        for(int i=0;i<t;i++)ans.add(ct+i);
        return ans;
    }
}