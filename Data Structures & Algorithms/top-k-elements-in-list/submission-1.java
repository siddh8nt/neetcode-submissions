class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        //element->frequency mapping
        int[] result = new int[k];
        for(int i = 0; i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        } 
    
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            for(int ele:map.keySet()){
                if(map.get(ele)>max){
                    max=map.get(ele);
                    result[i]=ele;
                }
               
            }
            map.remove(result[i]);

        }       
    return result;
    }

}//optimal solution using bucket sort