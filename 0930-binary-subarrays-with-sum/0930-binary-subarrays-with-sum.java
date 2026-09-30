class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int preSum=0;
        int count=0;



        for(int i=0;i<nums.length;i++)
        {
            preSum+=nums[i];
            int comp=preSum-goal;
            if(mp.containsKey(comp))
            {
                count+=mp.get(comp);


            }
            mp.put(preSum,mp.getOrDefault(preSum,0)+1);

            
        }
        return count;

        
    }
}