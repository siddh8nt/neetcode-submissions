class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int hi = 0, lo = 0, sum = 0;//variable size sliding window, hi and lo pointer start at 0
        int minLen = Integer.MAX_VALUE;

        while (hi < nums.length) {
            sum += nums[hi]; //added new hi element to sum to check for condition
            while (sum >= target) {//checking for condition
                minLen = Math.min(minLen, hi - lo + 1);//storing min length of valid subarray
                sum -= nums[lo];
                lo++;
                //this loop will keep running to find the smallest valid sub array for current right end positon of the subarrays
            }
            hi++;//to add new element to window now that window shrunk as current window now invalid
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;//in case no valid subarray that follows given condition
    }
}