class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        n=len(nums)
        l=0
        r=0
        z=0
        ans=0
        
        for r in range(n):
            if nums[r]==0:
                z+=1
            while z>1:
                if nums[l]==0:
                    z-=1
                l+=1
            ans=max(ans,r-l+1)
        return ans-1