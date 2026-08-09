class Solution {
    public void merge(int []arr,int low,int mid,int high)
    {
int n1=mid-low+1;
int n2=high-(mid+1)+1;
int [] left=new int [n1];
int [] right=new int [n2];
int k=0;

//fill the left array
for(int i=0;i<n1;i++)
{
    left[i]=arr[low+i];

}
//fill the right array
for(int i=0;i<n2;i++)
{
    right[i]=arr[mid+1+i];

}
//now merge the array
int i=0;
int j=0;
k=low;

 while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }

            k++;
        }
        while(i<n1)
        {
            arr[k++]=left[i++];

        }
          while(j<n2)
        {
            arr[k++]=right[j++];
            
        }
    }
    public void solve(int [] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(high+low)/2;
            solve(arr,low,mid);
            solve(arr,mid+1,high);
            merge(arr,low,mid,high);

        }
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        solve(nums,0,n-1);
        return nums;


        
    }
}