class Solution:
       def nextPermutation(self, nums):
        n = len(nums)
        for i in range(-1, -n-1, -1):
            if i > -n and nums[i-1] < nums[i]:
                break
            elif i == -n: # last lexical permutation
                nums.reverse()
                return
        
        nums[i:] = nums[i:][::-1] # reverse the partial order
        
        # use binary search to find the swap spot
        j = bisect.bisect_right(nums[i:], nums[i-1]) # j starts from 0
        nums[i-1], nums[i+j] = nums[i+j], nums[i-1]
        return

#TC: O(n)
#SC: O(1)
