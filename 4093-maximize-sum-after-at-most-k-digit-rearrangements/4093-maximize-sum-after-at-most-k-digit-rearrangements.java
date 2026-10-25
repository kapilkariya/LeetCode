class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++) sum+=nums[i];
        for(int i=0;i<nums.length;i++) arr[i]=fillval(nums[i]);
        for(int i=0;i<arr.length;i++) arr[i]=arr[i]-nums[i];
        Arrays.sort(arr);
        for(int i=0;i<(Math.min(k,arr.length));i++) sum+=((long) arr[arr.length-1-i]);
        return sum;
    }
    public int fillval(int num) {
        char[] nums = String.valueOf(num).toCharArray();
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder(new String(nums));
        sb.reverse();
        return Integer.parseInt(sb.toString());
    }
}