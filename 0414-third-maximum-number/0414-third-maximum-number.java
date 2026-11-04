class Solution {
    public int thirdMax(int[] nums) {
        Long m1 = Long.MIN_VALUE;
        Long m2 = Long.MIN_VALUE;
        Long m3 = Long.MIN_VALUE;
        for(int num : nums) {
            if(num > m1) {
                m3 = m2;
                m2 = m1;
                m1 = (long) num;
            }
            else if(num > m2 && num < m1) {
                m3 = m2;
                m2 = (long) num;
            }
            else if(num > m3 && num < m2) {
                m3 = (long) num;
            }
        }
        if(m3 != Long.MIN_VALUE) return m3.intValue();
        return m1.intValue();
    }
}