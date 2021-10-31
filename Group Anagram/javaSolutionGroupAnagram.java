//https://leetcode.com/problems/group-anagrams/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
         
        HashMap<String,List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char arr[]=str.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<String>());
            }
            map.get(s).add(str);
        }
      return new ArrayList<>(map.values());
    }    
    
}
