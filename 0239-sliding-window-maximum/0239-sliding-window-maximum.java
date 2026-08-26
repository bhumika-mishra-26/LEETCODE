class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
          //jab bhi naya element aaega make space for it //window ka size k se greater nhi hona chahiye 
        // jab nums[i] comes,there is no need to keep small elements  in that window pop them 
        //now push i in deque for nums[i]
        //if i>=k then deque .front is our answer ///iski time complexity yaad rakhna o(n) hoti h once for for push and pop
        int n=nums.length;
        int [] ans=new int [n-k+1];
        int id=0;

        Deque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!dq.isEmpty() && dq.peekFirst()<=(i-k))// window maintain kro 
            {
                dq.pollFirst();
                

            }
               while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])// elemnet chota h so usko hatao  
               // place hi tab karo jab vo element bada ho baaki saare hta do
            {
                dq.pollLast();
                

            }
            dq.offer(i);
             if(i>=k-1)
            ans[id++]=nums[dq.peekFirst()];


        }
        return ans;
    }
}