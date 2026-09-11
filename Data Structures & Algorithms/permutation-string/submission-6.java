class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int k = s1.length(), lo = 0;
    int hi = k-1;
    if (s1.length()>s2.length()) return false;
    HashMap<Character,Integer> str1 = new HashMap<>();
    HashMap<Character,Integer> str2 = new HashMap<>();
    for (char c: s1.toCharArray()) str1.put(c,str1.getOrDefault(c,0)+1);
    for (int i = lo; i<=hi;i++) str2.put(s2.charAt(i),str2.getOrDefault(s2.charAt(i),0)+1);
    if(str1.equals(str2)){
        return true;
    }
    while(hi<s2.length()&&lo<=hi){
        lo++;
        str2.put(s2.charAt(lo-1),str2.get(s2.charAt(lo-1))-1);
        if(str2.get(s2.charAt(lo-1))==0){
            str2.remove(s2.charAt(lo-1));
        }
        
        if(hi==s2.length()-1){
            break;
        }
        hi++;
    str2.put(s2.charAt(hi),str2.getOrDefault(s2.charAt(hi),0)+1);
    
     if(str1.equals(str2)){
        return true;
    }
    }
    return false;



        
    }
}
