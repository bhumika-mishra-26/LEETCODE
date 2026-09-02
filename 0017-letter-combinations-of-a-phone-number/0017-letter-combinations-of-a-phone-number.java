class Solution {
    public void solve(String digits,int index,StringBuilder str,HashMap<Integer,String>mp,List<String> ans)
    {
        if(index>=digits.length())
        {
            ans.add(str.toString());
            return ;


        }
        char ch=digits.charAt(index);
        int num=ch-'0';
        String g=mp.get(num);
        for(int i=0;i<g.length();i++)
        {
            str.append(g.charAt(i));
            solve(digits,index+1,str,mp,ans);
            str.deleteCharAt(str.length()-1);
            


        }

    }
    public List<String> letterCombinations(String digits) {
        int idx=0;
        List<String>ans=new ArrayList<>();
        HashMap<Integer,String>mp=new HashMap<>();
        mp.put(2,"abc");
        mp.put(3,"def");
        mp.put(4,"ghi");
        mp.put(5,"jkl");
        mp.put(6,"mno");
        mp.put(7,"pqrs");
        mp.put(8,"tuv");
        mp.put(9,"wxyz");
     
     

        solve(digits,idx,new StringBuilder(),mp,ans);
        return ans;



        
    }
}