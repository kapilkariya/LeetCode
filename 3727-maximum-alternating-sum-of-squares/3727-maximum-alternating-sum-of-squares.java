class Solution {
    public long maxAlternatingSum(int[] nums) {
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a, b) -> Integer.compare(Math.abs(a), Math.abs(b)));
        for (int i = 0; i < nums.length; i++)
            nums[i] = arr[i];
        long ans = 0;
        for (int i = 0; i < nums.length / 2; i++)
            ans -= (nums[i] * nums[i]);
        for (int i = (nums.length) / 2; i < nums.length; i++)
            ans += (nums[i] * nums[i]);
        return ans;
    }
}