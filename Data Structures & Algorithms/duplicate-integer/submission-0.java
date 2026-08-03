class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            freq.put(nums[i], freq.getOrDefault(nums[i],0)+1);
        }
        for(int num:freq.keySet()){
            if(freq.get(num)>1){
                return true;
            }
        }
        return false;
    }
}