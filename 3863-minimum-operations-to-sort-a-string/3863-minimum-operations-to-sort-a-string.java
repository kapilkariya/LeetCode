class Solution {
    public int minOperations(String s) {
        int ct=0;
        int ct2=0;
        char[] arr=s.toCharArray();
        char[] arr2=s.toCharArray();
        if(s.length()<=2){
            if(sort(0,s.length(),arr)) return -1;
            return 0;
        }
        if(sort(0,s.length()-1,arr)) ct++;
        if(sort(1,s.length(),arr)) ct++;
        if(sort(0,s.length()-1,arr)) ct++;
        if(sort(1,s.length(),arr2)) ct2++;
        if(sort(0,s.length()-1,arr2)) ct2++;
        if(sort(1,s.length(),arr2)) ct2++;
        return Math.min(ct,ct2);
    }
    public boolean sort(int x,int y,char[] arr){
        for(int i=x;i<y-1;i++){
            if(arr[i]>arr[i+1]){
                Arrays.sort(arr,x,y);
                return true;
            }
        }
        return false;
    }
}