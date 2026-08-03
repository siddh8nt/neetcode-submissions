class Solution {
    public int maxSubArray(int[] nums) {
        int i=0,currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(i=0;i<nums.length;i++){
         currSum+=nums[i];
         maxSum=Math.max(currSum,maxSum);
         if(currSum<0){
            currSum=0;
         }
        }
        return maxSum;
    }
}