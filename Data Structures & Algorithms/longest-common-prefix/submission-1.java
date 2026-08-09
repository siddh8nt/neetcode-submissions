class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";

        //find the min length of a string to further check first n common characters for each string in array
        int min_length=Integer.MAX_VALUE;
        for(int i = 0; i<strs.length;i++){
            min_length=Math.min(min_length,strs[i].length());
        }
        for(int i = 0; i< min_length;i++){
            for(int j=0; j<strs.length-1;j++){
               if(!(strs[j].substring(0,i+1).equals(strs[j+1].substring(0,i+1)))){
                return result;
               }
             }
        result+=strs[0].charAt(i);
        }
      return result;  
    }
}