#Time Complexity : O(nlogn + n) = O(nlogn) (sorting + iterating through the array
#Space Complexity : O(1)
#Any problem you faced while coding this : -

#The approach is to sort the array and then iterate through the array in steps of 2 and add the minimum of the two numbers to the result. This is because the minimum of the two numbers will be the number that will be added to the result. This is because the maximum number will be added to the result only if the minimum number is added to the result. So, we can add the minimum of the two numbers to the result. This will give us the maximum sum of the minimum of the two numbers.

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        result = 0
        nums.sort()
        for i in range(0,len(nums)-1,2):
            result += min(nums[i], nums[i+1])

        return result