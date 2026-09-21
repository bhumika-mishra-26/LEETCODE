class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=0;
        int maxi=0;


        while(i<j)
        {
          int   w=j-i;
        int     h=Math.min(height[i],height[j]);

            area=w*h;
            maxi=Math.max(area,maxi);

            if(height[i]<height[j])
            {
                i++;

            }
            else{
                j--;

            }

        }
        return maxi;
        
        
    }
}