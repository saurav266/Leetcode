class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> mp= new HashMap<>();

        for(String word:strs){
            char[] ch= word.toCharArray();
            Arrays.sort(ch);
            String temp= new String(ch);

            if(!mp.containsKey(temp)){
                mp.put(temp,new ArrayList<>());
            }
            mp.get(temp).add(word);
        }
        return new ArrayList<>(mp.values());
    }
}