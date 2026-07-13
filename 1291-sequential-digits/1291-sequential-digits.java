class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>arr=new ArrayList<>();
        String a=String.valueOf(low);
        String b=String.valueOf(high);

        int min=a.length();
        int maxi=b.length();
        String n="123456789";
        for(int len=min;len<=maxi;len++)
        {
        for(int i=0;i+len<=n.length();i++)
        {
            String ab=n.substring(i,i+len);
            int pq=Integer.parseInt(ab);
            if(pq>=low && pq<=high)
            arr.add(pq);

        }
        }
        return arr;

        
    }
}