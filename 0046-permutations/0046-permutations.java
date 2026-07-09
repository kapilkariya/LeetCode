class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        HashSet<Integer> s=new HashSet<>();
        dfs(s,nums,l,ans);
        return ans;
    }
    public void dfs(HashSet<Integer> s,int[] nums,List<Integer> l,List<List<Integer>> ans){
        if(s.size()==nums.length){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!s.contains(nums[i])){
                l.add(nums[i]);
                s.add(nums[i]);
                dfs(s,nums,l,ans);
                s.remove(nums[i]);
                l.remove(l.size()-1);
            }
        }
    }
}