class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxi=Integer.MIN_VALUE;
        int w=0;
        int h=0;
        int area=0;



        while(i<j)
        {
            w=j-i;
            h=Math.min(height[i],height[j]);
            area=w*h;
            maxi=Math.max(maxi,area);
            if(height[i]<height[j])
            {
                i++;

            }
            else 
            {
                j--;
            }


        }
        return maxi;
    }
}