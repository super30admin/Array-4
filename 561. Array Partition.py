##561. Array Partition#######################################################################################
// Time Complexity : nlogn for sorting
// Space Complexity : O(1) -> no extra space just calculation for rolling hash
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no problem

// Your code here along with comments explaining your approach in three sentences only
Just sorted the array and returned the sum of number at even indexes


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        sum=0
        for i in range(0,len(nums),2):
            #print(i)
            sum+=nums[i]
        return sum

        
        
