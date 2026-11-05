class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ct = 0;
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            int idx = Arrays.binarySearch(arr2, arr1[i]);
            if (idx >= 0) continue;
            idx = -idx - 1;
            boolean valid = true;
            if (idx < arr2.length && Math.abs(arr1[i] - arr2[idx]) <= d)
                valid = false;
            if (idx > 0 && Math.abs(arr1[i] - arr2[idx - 1]) <= d)
                valid = false;
            if (valid) ct++;
        }
        return ct;
    }
}