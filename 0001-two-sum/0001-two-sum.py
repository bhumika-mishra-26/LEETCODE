class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        mp={}
        n=len(nums)
        for i in range(n):
            mp[nums[i]]=i
        for i in range(n):
            comp=target-nums[i]
            if comp in mp and mp[comp]!=i:
                return [i,mp[comp]]
        return []

        