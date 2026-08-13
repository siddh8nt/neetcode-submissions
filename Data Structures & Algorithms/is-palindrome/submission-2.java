class Solution {
    public boolean isPalindrome(String s) {
        // s=s.replaceAll("\\s","");//ADD TO STRINGS CHEATSHEET
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();//ADD TO STRINGS CHEATSHEET
        System.out.print(s);
        int i = 0, j = s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
         

        }
       return true;    
    }
}
