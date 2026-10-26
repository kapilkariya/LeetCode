class Solution {
    public int totalNumbers(int[] digits) {
        int ct=0;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<digits.length;i++){
            for(int j=0;j<digits.length;j++){
                for(int k=0;k<digits.length;k++){
                    if(i!=j && j!=k && i!=k && digits[i]!=0){
                        int num=digits[i]*100+digits[j]*10+digits[k];
                        if(num%2==0 && !s.contains(num)){
                            s.add(num);
                            ct++;
                        }
                    }
                }
            }
        }
        return ct;
    }
}