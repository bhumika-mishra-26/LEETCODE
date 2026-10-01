class Solution {
    public void wiggleSort(int[] nums) {

        int n = nums.length - 1;

        int[] newArr = new int[nums.length];

      
        for(int i = 0; i <= n; i++) {
            newArr[i] = nums[i];
        }

      
        Arrays.sort(newArr);

    
        for(int i = 1; i < nums.length; i += 2) {
            nums[i] = newArr[n];
            n--;
        }

       
        for(int i = 0; i < nums.length; i += 2) {
            nums[i] = newArr[n];
            n--;
        }
    }
}