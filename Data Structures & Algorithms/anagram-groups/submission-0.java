class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        

        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String ele = new String(chars);

            map.putIfAbsent(ele,new ArrayList<>());
            map.get(ele).add(str);

        }
        

        return new ArrayList<>(map.values());
    }
}
