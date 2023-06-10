 class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int s=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==s){
                s++;
            }
        }
        return s;
        
    }
}


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;
        while(row<matrix.length&&col>=0)
        {
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(target<matrix[row][col])
            {
               col--;
            }
            else{
               row++;
             }
        }
        return false;
        
        
    }
}