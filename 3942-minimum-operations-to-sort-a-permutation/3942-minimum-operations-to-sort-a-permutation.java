    class Solution {
        public int minOperations(int[] nums) {
            int ct=0;
            int idx=-1;
            if(check(nums)){
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]>nums[i+1]) {
                        idx=i;
                        break;
                    }
                }
                if(idx==-1) return 0;
                ct=Math.min(idx+1,nums.length-idx+1);
            }
            else if (check2(nums)){
                for(int i=nums.length-1;i>0;i--){
                    if(nums[i]>nums[i-1]) {
                        idx=i;
                        break;
                    }
                }
                if(idx==-1) return 1;
                ct=Math.min(nums.length-idx,nums.length-(nums.length-idx));
                ct++;
            }
            else return -1;
            return ct;
        }
        public boolean check(int[] nums) {
            boolean a=true;
            for(int i=0;i<nums.length;i++){
                if(nums[i%nums.length]>nums[(i+1)%nums.length]){
                    if(!a) return false;
                    a=false;
                }
            }
            return true;
        }
        public boolean check2(int[] nums) {
            boolean a=true;
            for(int i=0;i<nums.length;i++){
                if(nums[i%nums.length]<nums[(i+1)%nums.length]){
                    if(!a) return false;
                    a=false;
                }
            }
            return true;
        }
    }