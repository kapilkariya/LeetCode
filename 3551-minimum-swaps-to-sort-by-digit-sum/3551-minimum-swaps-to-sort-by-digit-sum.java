class Solution {
    static {
        System.out.close();
    }

    public int minSwaps(int[] nums) {
        Integer[] arr = new Integer[nums.length];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            map.put(nums[i], i);
        }
        Arrays.sort(arr, (a, b) -> sum(a) != sum(b) ? sum(a) - sum(b) : a - b);
        int i = 0;
        int ct = 0;
        while (i < arr.length) {
            if (nums[i] != arr[i]) {
                int j = map.get(arr[i]);
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                ct++;
            } else
                i++;
        }
        return ct;
    }

    public int sum(int num) {
        int ans = 0;
        while (num >= 1) {
            ans += (num % 10);
            num /= 10;
        }
        return ans;
    }
}