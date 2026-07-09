class Solution {
    public List<List<Integer>> permute(int[] nums) {
        boolean[] test=new boolean[nums.length];
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        dfs(nums,ans,l,test);
        return ans;
    }

    public void dfs(int[] nums,List<List<Integer>> ans, List<Integer> l,boolean[] test){
        if(l.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!test[i]){
                l.add(nums[i]);
                test[i]=true;
                dfs(nums,ans,l,test);
                l.remove(l.size()-1);
                test[i]=false;
            }
        }
    }
}