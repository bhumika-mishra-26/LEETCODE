class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer>st=new HashSet<>();
        List<Integer>arr=new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();


        for(int i:nums)
        {
            st.add(i);

        }
    int i=lower;
    while(i<=upper)
    {
if(st.contains(i))
{
    i++;
    continue;



}
int start=i;
while(i<=upper && !st.contains(i))
{
    i++;

}
int end=i-1;
res.add(Arrays.asList(start,end));


    }

    return res;


      

        
    }
}