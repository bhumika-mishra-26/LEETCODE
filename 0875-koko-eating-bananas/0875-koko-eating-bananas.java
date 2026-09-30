class Solution {
    public boolean canEatAllBananas(int [] prices,int mid,int h )
    {
        int hours=0;

        for(int i:prices)
        {
hours+=i/mid;
if(i%mid!=0)
hours++;

        }
        return hours<=h;

    }
    public int minEatingSpeed(int[] prices, int h) {
        int n=prices.length;
        // dekho isme tumko nikkalna h koko har hour mai kitne fruits khaye ki vo saare fruits khatam karle h hours se pehle so use bs for that 
        int l=1;
        int maxi=0;
        for(int i:prices)
        {
            maxi=Math.max(maxi,i);

        }
        int high=maxi;
        while(l<high)
        {
            int mid=l+(high-l)/2;
            if(canEatAllBananas(prices,mid,h))
            {
                high=mid;
                //possible ans;

            }
            else
            l=mid+1;

        }
        return l;

        
    }
}