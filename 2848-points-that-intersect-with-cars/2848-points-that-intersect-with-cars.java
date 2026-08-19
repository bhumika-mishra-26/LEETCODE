class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int [] preSum=new int [102];
        for(int i=0;i<nums.size();i++)
        {
            int a=nums.get(i).get(0);
            int b=nums.get(i).get(1);
            preSum[a]+=1;
            preSum[b+1]-=1;


        }
        int count=0;

        for(int i=1;i<preSum.length;i++)
        {
            preSum[i]=preSum[i-1]+preSum[i];
            if(preSum[i]>0)
            count++;


        }
        return count;

    
        
    }
}