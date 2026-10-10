class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        return atMost(nums,k) - atMost(nums,k-1);
        
    }
    public int atMost(int[] nums,int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        int n = nums.length;
        int max = 0;
        int left = 0;
        for(int i = 0 ; i < n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            while(map.size() > k){
                map.put(nums[left] , map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            max = max + i - left + 1;
        }
        return max;
    }
}