class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder ans=new StringBuilder();
        if((num)*9<sum) return ans.toString();
        for(int i=0;i<num;i++){
            if(sum==0) ans.append(0);
            else if(sum>=9){
                ans.append(9);
                sum-=9;
            }
            else{
                ans.append(sum);
                sum=0;
            }
        }
        return ans.toString();
    }
}