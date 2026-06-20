class Solution {
    // brute force approach
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int n = nums.length;
        for(int i =0;i<n;i++){
        int cur = 0;
        for(int j = i; j< n; j++){
            cur += nums[j];
            maxSub = Math.max(maxSub, cur);
        }
        }
        return maxSub;
    }
}
