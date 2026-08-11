class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //two pointer starts form the right, idx at the end of nums1 array

        int i=m-1,j=n-1,idx=nums1.length-1;

        while((i>=0)&&(j>=0)){
            if(nums1[i]>=nums2[j]){//less than equal to in condition so we dont need to separately handle == case
                nums1[idx]=nums1[i];
                i--;
                idx--;
            }
            else{
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }

        }
        //handling cases when while loop breaks due to completion of one array using two independent while loops
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }

        while(i>=0){
            nums1[idx]=nums1[i];
            idx--;
            i--;
        }
      
    }
}