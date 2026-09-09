class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hi = 0, lo = 0, maxSubstr = Integer.MIN_VALUE;
        Map<Character, Integer> freq = new HashMap<>();

        for(hi = 0; hi < s.length(); hi++){
            freq.put(s.charAt(hi), freq.getOrDefault(s.charAt(hi),0)+1);

            while(freq.size()<hi-lo+1){
                freq.put(s.charAt(lo), freq.get(s.charAt(lo))-1);
                if(freq.get(s.charAt(lo))==0){
                    freq.remove(s.charAt(lo));
                }
                lo++;

            }
            if(freq.size()==hi-lo+1){
                maxSubstr=Math.max(maxSubstr, hi-lo+1);
            }
        }
        return (maxSubstr==Integer.MIN_VALUE)?0:maxSubstr;
    }
}