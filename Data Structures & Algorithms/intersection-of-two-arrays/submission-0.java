class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
    for(int i=0;i<nums2.length;i++){
        if(hs.contains(nums2[i])){
            result.add(nums2[i]);
        }
    }
    int[] res = new int[result.size()];
        int j=0;
        for(int num:result){
            res[j]=num;
            j++;

        
    }
   return res; 
}
}