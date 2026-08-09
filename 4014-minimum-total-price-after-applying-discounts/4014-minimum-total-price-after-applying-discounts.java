class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

       int j=prices.length-1;
       int i=discounts.length-1;
       double price=0;

       while(j>=0 && i>=0)
       {
        price+=(prices[j]*(100-discounts[i]))/100.0;
        j--;
        i--;


    

       }
       while(j>=0)
       {
        price+=prices[j];
        j--;


       }
       return price;

        
    }
}