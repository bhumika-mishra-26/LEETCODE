class Solution {
    // isme har baar  uss digit se ek character pick karke we are moving on to the next character of that string mtlb breadth par uss character ki digits ko expand kar rhe h 

    public  void solve(String digits,int idx,List<String>ans,StringBuilder   res,  Map<Character, String> mp)

    {
        if(idx>=digits.length())
        {
ans.add(res.toString());
return ;

        }
        char curr=digits.charAt(idx);
        String letter=mp.get(curr);


        for(int i=0;i<letter.length();i++)
        {
           res.append(letter.charAt(i));

            solve(digits,idx+1,ans,res,mp);
            res.deleteCharAt(res.length()-1);
            


        }
    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();
        int n=digits.length();
        if(n==0)
        return new ArrayList<>();

     Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");


        solve(digits,0,ans,new StringBuilder(), digitToLetters);
        return ans;


    }
}