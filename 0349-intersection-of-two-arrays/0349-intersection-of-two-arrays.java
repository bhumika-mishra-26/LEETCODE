class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashMap<Integer,Integer>mp=new HashMap<>();
     ArrayList<Integer>l=new ArrayList<>();




     for(int i:nums1)
     {
        mp.put(i,mp.getOrDefault(i,0)+1);

     }
     for(int i:nums2)
     {
        if(mp.containsKey(i))
        {
            l.add(i);
            mp.remove(i);


        }
     }
     int [] ans=new int [l.size()];
     for(int i=0;i<l.size();i++)
     {
        ans[i]=l.get(i);

     }
        return ans;
        
    }
}