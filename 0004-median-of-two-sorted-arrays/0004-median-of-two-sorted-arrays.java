class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int idx1=(n1+n2)/2-1;
        int idx2=(n1+n2)/2;
        int ele1=-1;
        int ele2=-1;
        int i=0;
        int j=0;
        int k=0;


        while(i<n1 && j<n2)
        {
            if(nums1[i]<=nums2[j])
            {
               
                if(k==idx1)
                {
                    ele1=nums1[i];

                }
                if(k==idx2)
                {
                    ele2=nums1[i];

                }   
                k++;
                i++;

                
            }
            else{
             
                  if(k==idx1)
                {
                    ele1=nums2[j];

                }
                if(k==idx2)
                {
                    ele2=nums2[j];

                }   
                k++;
                j++;



            }
        }
        while(i<n1)
        {
         

             if(k==idx1)
                {
                    ele1=nums1[i];

                }
                if(k==idx2)
                {
                    ele2=nums1[i];

                }   
                i++;
                k++;

                
        }
        while(j<n2)
        {
           
             if(k==idx1)
                {
                    ele1=nums2[j];

                }
                if(k==idx2)
                {
                    ele2=nums2[j];

                }   
                j++;
                k++;

                
        }
        if((n1+n2)%2!=0)
        return ele2;
        else
        return (ele1+ele2)/2.0;

        
    }
}