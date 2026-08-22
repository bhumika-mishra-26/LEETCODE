class Solution {
    public void swap(int [] nums,int first,int sec)
    {
        int temp=nums[first];
        nums[first]=nums[sec];
        nums[sec]=temp;

    }
    public void solve(int idx,int n,List<List<Integer>>ans,int [] nums)
    {
        if(idx==n)
        {
       List<Integer>arr=new ArrayList<>();
       for(int num:nums)
       {
        arr.add(num);

       }
       ans.add(arr);
       return ;
        }

        for(int i=idx;i<nums.length;i++)
        {//
   //     isme swap karenge  karenge 
            swap(nums,i,idx);
            //explore step
            solve(idx+1,n,ans,nums);
            //undo this step
            swap(nums,i,idx);

        

        }

    }
    // isme har index ko swap karo idx se 
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        int idx=0;
        List<List<Integer>>ans=new ArrayList<>();

        solve(idx,n,ans,nums);
        return ans;


        
    }
}