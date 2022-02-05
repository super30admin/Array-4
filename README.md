# Array-4

## Problem1 Array partition I (https://leetcode.com/problems/array-partition-i/)

# Time Complexity=O(nlogn)
# Space Complexity=O(1))

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        a=0
        for i in range(0,len(nums),2):
            a+=nums[i]
        return a
            
        

## Problem2 Maximum Subarray (https://leetcode.com/problems/maximum-subarray/)
# Time Complexity=O(n)
# Space Complexity=O(1)


class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        greedy=0
        smart=nums[0]
        for i in range(len(nums)):
            greedy+=nums[i]
            if greedy>smart:
                smart=greedy
            if greedy<0:
                greedy=0
        return smart
        

## Problem3  Next permutation(https://leetcode.com/problems/next-permutation/)

# Time Complexity=O(n)
# Space Complexity=O(1)

class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        def reverse(i,j,nums):
            while i<j:
                nums[i],nums[j]=nums[j],nums[i]
                i+=1
                j-=1
            
        swap=-1
        n=len(nums)
        for i in range(n-1,0,-1):
            if nums[i-1]<nums[i]:
                swap=i-1
                break
        if swap==-1:
            reverse(0,n-1,nums)
            return nums         
        sec=0
        for i in range(swap+1,n):
            if nums[i]>nums[swap]:
                sec=i
        nums[swap],nums[sec]=nums[sec],nums[swap]
        reverse(swap+1,n-1,nums)
        return nums
                
                
        