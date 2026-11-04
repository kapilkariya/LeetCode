class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        int[] arr=new int[26];
        int[] arr2=new int[26];
        for(char c:s.toCharArray()) arr[c-'a']++;
        int prev=-1;
        for(int i=0;i<s.length();i++){
            arr2[s.charAt(i)-'a']++;
            arr[s.charAt(i)-'a']--;
            if(check(arr,arr2)) {
                ans.add(i-prev);
                prev=i;
                Arrays.fill(arr2,0);
            }
        }
        return ans;
    }
    public boolean check(int[] arr,int[] arr2){
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=0 && arr[i]!=0) return false;
        }
        return true;
    }
}