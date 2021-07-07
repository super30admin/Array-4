# Problem 1: Array partition I
## Time Complexity :
O(nlogn)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
No.

## Your code here along with comments explaining your approach
### Solution:
      class Solution:
          def arrayPairSum(self, nums: List[int]) -> int:
              nums=sorted(nums)
              sum=0
              for i in range(0,len(nums),2):
                  sum+=nums[i]
              return sum

# Problem 2: Maximum Subarray
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
No.

## Your code here along with comments explaining your approach
### Solution:
      class Solution:
          def maxSubArray(self, nums: List[int]) -> int:
              n=len(nums)
              runningSum,globalMax=0,float('-inf')
              for i in range(n):
                  runningSum=max(runningSum+nums[i],nums[i])
                  globalMax=max(globalMax,runningSum)
              return globalMax
              
# Problem 3: Maximum Subarray
## Time Complexity :
O(n)

## Space Complexity :
O(1)

## Did this code successfully run on Leetcode :
Yes.

## Any problem you faced while coding this :
No.

## Your code here along with comments explaining your approach
### Solution:
      class Solution:
          def nextPermutation(self, nums: List[int]) -> None:
              #O(n)
              #O(1)
              """
              Do not return anything, modify nums in-place instead.
              """
              def reverse(nums,start,end):
                  i,j=start,end
                  while(i<j):
                      swap(nums,i,j)
                      i+=1
                      j-=1

              def swap(nums,i,j):
                  nums[i],nums[j]=nums[j],nums[i]

              n=len(nums)
              if (n<=1):
                  return
              i=n-2
              while(nums[i]>=nums[i+1]):
                  i-=1
                  if i==-1:
                      break
              if i>=0:
                  j=n-1
                  while nums[j]<=nums[i]:
                      j-=1
                  swap(nums,i,j)
              reverse(nums,i+1,n-1)
