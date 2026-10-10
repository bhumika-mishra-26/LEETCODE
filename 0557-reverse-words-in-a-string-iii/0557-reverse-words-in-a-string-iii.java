class Solution {
    public String reverseWords(String s) {
        String []  word=s.split("\\s+");
        StringBuilder reversed=new StringBuilder();
       for(String w:word)
       {
        StringBuilder rev=new StringBuilder(w);
        rev.reverse();
        reversed.append(rev).append(" ");

       } 
       return reversed.toString().trim();

        
    }
}