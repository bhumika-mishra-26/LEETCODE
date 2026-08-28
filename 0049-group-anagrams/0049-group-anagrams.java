class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>mp=new HashMap<>();
        for(String s:strs)
        {
            char [] ch=s.toCharArray();
            Arrays.sort(ch);
        String new_str=new String(ch);
        if(!mp.containsKey(new_str))
        {
            mp.put(new_str,new ArrayList<>());

        }
        mp.get(new_str).add(s);



        }
       List<List<String>> ans = new ArrayList<>();

        for (List<String> list : mp.values()) {
            ans.add(list);
        }

        return ans;


        
    }
}