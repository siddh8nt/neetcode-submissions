class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap<Integer,Integer> map = new HashMap<>();
    //subarray sum(prefix sum) -> frequency of that sum mapping
    map.put(0,1);
   
    int preSum=0, count=0;
    for(int i = 0; i<nums.length; i++){
        preSum+=nums[i];
        if(map.containsKey(preSum-k)) {
            count+=map.get(preSum-k); //should be presum-k here also
            
            //count++ doesnt work, multiple starting indices can make for the target subarray satisfying target int sum, so add its frequency each time wfind a satisfying prefix sum for ending index
        }  
       map.put(preSum, map.getOrDefault(preSum,0)+1);     
    }
    return count;
    }
}