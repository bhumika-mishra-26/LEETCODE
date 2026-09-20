class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int l=0;
        int count=0;

        int r=nums.size()-1;
        while(l<r)
        {
            if(nums.get(l)+nums.get(r)<target)
            {
                count+=(r-l);
                l+=1;


            }
            else{
                r-=1;

            }
        }
        return count;


    }
}