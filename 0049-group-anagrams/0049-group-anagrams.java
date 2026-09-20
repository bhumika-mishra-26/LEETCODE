class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>ans=new ArrayList<>();
        HashMap<String,List<String>>mp=new HashMap<>();

        for(String s:strs)
        {
            char [] c=s.toCharArray();
            Arrays.sort(c);
            String new_str=new String(c);
            if(!mp.containsKey(new_str))
            {
                mp.put(new_str,new ArrayList<>());

            }
            mp.get(new_str).add(s);


        }


        for(List<String>a:mp.values())
        {
            ans.add(a);



        }
        return ans;

    }
}