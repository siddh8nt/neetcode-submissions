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
//SUBOPTIMAL METHOD NOW TRY MAKING 26 CHARACTER INDEXED ARRAY AND THE KEY FOR HASHMAP AS SORTING CAUSES THIS SOLUTION TO BECOME O(N*KLOGK) WHERE K IS THE SIZE OF MAXIMUM STRING LENGTH 