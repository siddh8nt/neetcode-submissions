class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, unique = 1;//initally 0th element alloted
        //i is alloted ; j is check unique
        while(j<nums.length){
            if(nums[i]!=nums[j]){//if j is pointing to a new unique element
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;

                i++; //i+1 is now alloted
                unique++;

            }
            j++;
        }
      int[] expectedNums= new int[unique];
      for(int q=0;q<unique;q++) {
        expectedNums[q]=nums[q];
      }
      return unique;
    }
}