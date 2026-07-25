class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>l=new ArrayList<>();
        while(n>0)
        {
        int     r=n%10;
        l.add(r);
    n/=10;


        }
        Collections.sort(l);
        int s=l.size();

      return   l.get(s-1)*l.get(s-2);

        
    }
}