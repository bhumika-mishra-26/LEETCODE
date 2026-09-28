class Solution {
    public int largestRectangleArea(int[] heights) {
        // dekho ye solution optimal nhi h par  baad mai dekhlena
        // isme dekho humko left smaller ka track rakhna hoga bcz humko area tabhi niklega also humko right smaller ka track rakhna hoga 
        // tabhi humlog left smaller aur right smaller wali arrya create karenge 
        int n=heights.length;

        int [] nse=new int [n];
        int [] pse=new int [n];
        Stack<Integer>st1=new Stack<>();
        Stack<Integer>st2=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while(!st1.isEmpty()  && heights[st1.peek()]>=heights[i])
            {
                st1.pop();

            }
            if(st1.isEmpty())
            {
pse[i]=0;

            }
            else
            pse[i]=st1.peek()+1;//iske baad hoga na kyuki 

            st1.push(i);

        }
        // next smaller element nikaalo ab 
        for(int i=n-1;i>=0;i--)
        {
             while(!st2.isEmpty()  && heights[st2.peek()]>=heights[i])
            {
                st2.pop();

            }
            if(st2.isEmpty())
            {
nse[i]=n-1;

            }
            else
            nse[i]=st2.peek()-1;

            st2.push(i);

        }

        int maxi = 0;

        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] +1;
            int area = heights[i] * width;

            maxi = Math.max(maxi, area);
        }

        return maxi;

    }
}