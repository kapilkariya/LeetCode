class Solution {
    public boolean canAliceWin(int n) {
        int a=10;
        while(true){
            if(n<a) return false;
            n-=(a--);
            if(n<a) return true;
            n-=(a--);
        }   
    }
}