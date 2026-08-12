class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        
        int i = 0;
        while(i<nums.length-2){
            //initailzing two pointers for each element of nums array
            int j=i+1;
            int k=nums.length-1;
            int target=0-nums[i]; //target for each iteration of two sum
            
            while(j<k){
            if(nums[j]+nums[k]>target){
                k--;
            }
            else if(nums[j]+nums[k]<target){
                j++;
            }
            else{//handling case where sum==target
            result.add(List.of(nums[i],nums[j],nums[k]));
            j++;
            k--; //both j and k should move in this case

            //Deduplication logic to ensure uniqueness
            while(j<nums.length&&nums[j-1]==nums[j]){//1st && condition to avoid array index out of bounds error
                j++;
            }
            while(i>0&&nums[k+1]==nums[k]){//1st && condition to avoid array index out of bounds error
                k--;
            }//two independent while loops 
            }//end of sum==target case
            }
        i++;//dont forget to increment i
        //also need to ensure uniqueness of i pointer
        while(i<nums.length-2&&nums[i]==nums[i-1]){//1st && condition to avoid array index out of bounds error
            i++;
        }
        }
      return result;
    }
}
