class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int [] ans=new int [k];

        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);

        }
        PriorityQueue<int []>pq=new PriorityQueue<>((a,b)->a[1]-b[1]);

      for(int i:mp.keySet())
      {
        pq.offer(new int []{i,mp.get(i)});
        if(pq.size()>k)
        {
            pq.poll();

        }
      }
      for(int i=0;i<ans.length;i++)
      {
        ans[i]=pq.poll()[0];

      }
      return ans;
    }
}