class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //brute force solution
        //o(n^2)
        int n = nums.length;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int curSum = 0, j = i;
            while (j < n) {
                curSum += nums[j];
                if (curSum >= target) {
                    res = Math.min(res, j - i + 1);
                    break;
                }
                j++;
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res; // if none found  = target then return 0 directly
    }
}