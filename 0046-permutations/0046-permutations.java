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
            ArrayList<Integer>res=new ArrayList<>();

            for(int i:nums)
            {
                res.add(i);

            }
            ans.add(res);
            return ;
        }

            // isme ab swap karenge idx ko i se fir usko undo akrenge 
            // dekho isme har index par  har ek  elemnt aa skta h  aur agar idx to 0 se karenge to repeat hogi isliye we start from idx

            for(int i=idx;i<nums.length;i++)
            {
                //perform swap
                swap(nums,i,idx);
                // recursive call karo 
                solve(idx+1,n,ans,nums);
                // undo karo swap operation ko 
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