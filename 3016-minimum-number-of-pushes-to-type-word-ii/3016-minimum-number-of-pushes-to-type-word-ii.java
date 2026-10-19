class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Arrays.sort(arr);
        for (int i = 0; i<arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        int i = 0;
        int j = 0;
        int ct = 0;
        while (j < 8 && i < arr.length) {
            if (arr[i] != 0) {
                ct += arr[i];
                j++;
            }
            i++;
        }
        while (j < 16 && i < arr.length) {
            if (arr[i] != 0) {
                ct += (arr[i] * 2);
                j++;
            }
            i++;
        }
        while (j < 24 && i < arr.length) {
            if (arr[i] != 0) {
                ct += (arr[i] * 3);
                j++;
            }
            i++;
        }
        while (j < 26 && i < arr.length) {
            if (arr[i] != 0) {
                ct += (arr[i] * 4);
                j++;
            }
            i++;
        }
        return ct;
    }
}