class Solution {
    public int[] minOperations(String boxes) {
        int[] arr=new int[boxes.length()];
        for(int i=0;i<arr.length;i++){
            int ans=0;
            for(int j=0;j<arr.length;j++){
                if(i!=j && boxes.charAt(j)=='1') ans+=(Math.abs(j-i));
            }
            arr[i]=ans;
        }
        return arr;
    }
}