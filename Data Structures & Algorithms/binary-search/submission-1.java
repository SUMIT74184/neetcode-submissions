class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length -1;
        int m = start + (end - start) / 2;

        while(start <= end){
            m = start + (end - start) / 2;
            if(nums[m] == target){
                return m;
            }

            else if(target > nums[m]){
              start =  m + 1;

            }else {
                end = m - 1;
            }     
            
        }
        return -1;
    }
}
