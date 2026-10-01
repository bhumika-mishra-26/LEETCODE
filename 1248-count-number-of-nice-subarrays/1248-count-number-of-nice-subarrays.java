class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
    HashMap<Integer,Integer>mp=new HashMap<>();
    int ans=0;
    mp.put(0,1);
    int cnt=0;
    for(int i:nums)
    {
        if(i%2==1)
        {
            cnt+=1;
        }
        if(mp.containsKey(cnt-k))
        ans+=mp.get(cnt-k);
        mp.put(cnt,mp.getOrDefault(cnt,0)+1);
    }
    return ans;
        
    }
}
 