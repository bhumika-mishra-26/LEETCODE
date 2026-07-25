class Solution {
    public boolean canEatAll(int [] piles,int mid,int h)
    {
        int actual=0;
        for(int x:piles)
        {
            actual+=x/mid;
            if(x %mid!=0)
            actual++;

        }
        return actual<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int p=piles.length;
        int maxi=0;
        for(int i:piles)
        {
            maxi=Math.max(i,maxi);

        }
        int l=1;
        int r=maxi;
        while(l<r)
        {
            int mid=l+(r-l)/2;
            if(canEatAll(piles,mid,h))
            {
                r=mid;

            }
            else{
                l=mid+1;

            }

        }
        return l;

        
    }
}