class Solution {
    public int sortableIntegers(int[] nums) {
        int ans = 0;
        for (int k = 1; k <= nums.length; k++) {
            int mn=0;
            int mx=0;
            if (nums.length % k == 0) {
                int i = 0;
                int j = 0;
                boolean sorted = true;
                while (j < nums.length) {
                    i = j;
                    j += (k - 1);
                    List<Integer> l=check(nums, i, j,mn,mx);
                    sorted = sorted && (l.get(2)==1);
                    mn=l.get(0);
                    mx=l.get(1);
                    j++;
                }
                if (sorted)
                    ans += k;
            }
        }
        return ans;
    }

    public List<Integer> check(int[] nums, int x, int y,int pmn,int pmx) {
        int mn=Integer.MAX_VALUE;
        int mx=0;
        int drops = 0;
        int len = y - x + 1;
        for (int i = x; i <= y; i++) {
            if(nums[i]<mn) mn=nums[i];
            if(nums[i]>mx) mx=nums[i];
            int next = x + (i + 1 - x) % len;
            if (nums[i] > nums[next]) {
                drops++;
            }
        }
        boolean b=drops <= 1;
        List<Integer> l=new ArrayList<>();
        l.add(mn);
        l.add(mx);
        if(pmx>mn){
            l.add(0);
            return l;
        }
        if(b) l.add(1);
        else l.add(0);
        return l;
    }
}