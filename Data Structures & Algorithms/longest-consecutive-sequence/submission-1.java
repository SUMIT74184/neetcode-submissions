class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int res = 0, curr = nums[0], streak = 0, i =0;

        while(i < nums.length){
            if(curr != nums[i]){ //1,2,3,4,100 case ...streak broken
                curr = nums[i];
                streak = 0;
            }
            while(i < nums.length && nums[i] == curr){
                i++; //duplicate case checking
            }
            streak++;
            curr++;  // this moves one at time (+1)
            res = Math.max(res,streak);
        }
        return res;
    }
}
