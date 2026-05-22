class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int l = 0;
        int r = (rows*cols)-1;

        while(l<=r){
            int mid = l + (r-l) /2;

            // Convert 1D index into 2D row and col
            int row = mid / cols;
            int col = mid % cols;

            int value = matrix[row][col];

            if(value == target){
                return true;
            }

            if(value > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }

        }
        return false;
    }
}
