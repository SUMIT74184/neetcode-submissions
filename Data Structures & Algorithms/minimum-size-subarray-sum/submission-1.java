class Solution {
    //sliding window approach
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, total = 0;
        int res  = Integer.MAX_VALUE;
        int n = nums.length;

        for(int r = 0; r < nums.length; r++){
            total+= nums[r];
            while(total >= target){
                res = Math.min(r - left + 1 ,res);
                total -=nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}