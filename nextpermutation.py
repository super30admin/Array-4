# Time Complexity : O(N) where N is length of  array
# Space Complexity : O(1) as we are using constant space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach:
# I am iterating from the end of the array to find the first decreasing element.
# If no such element is found, I reverse the entire array and return.
# If such an element is found, I again iterate from the end to find the first element which is greater than the found element.
# I swap these two elements and then reverse the subarray after the index of the first found element to get the next permutation.
# This approach ensures that we get the next lexicographically greater permutation.
# In the case where no such permutation is possible, reversing the array gives us the smallest permutation.
# In the we break the array into two parts and reverse the second part to ensure that we get the smallest possible arrangement of that part.


from typing import List
class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        n = len(nums)
        idx = -1
        for i in range(n-2,-1,-1):
            if nums[i] < nums[i+1]:
                idx = i
                break
        if idx == -1:
            nums.reverse()
            return 
        for i in range(n-1,idx,-1):
            if nums[i] > nums[idx]:
                nums[i],nums[idx] = nums[idx],nums[i]
                break
        nums[idx+1:] = reversed(nums[idx+1:])
