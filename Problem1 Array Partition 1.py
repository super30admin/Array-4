#Problem 1:https://leetcode.com/problems/array-partition-i
#Test Cases passed on Leetcode 
#Time Complexity:    O(nlogn) ->due to sorting
#Space Complexity:   O(1)


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        #First sort them , since we dont want that higer values to get wasted every time we pick the minimum if the pairs
        nums.sort()
        sum=0
        #eg :[1,4,3,2,9,6,5,8]
        #after sorting:[1,2,3,4,5,6,8,9]
        #if we pair them and take min: 1,2->min 1 ;3,4 ->min 3 and so on that is we need to move itrate two steps forward instead of 1 to take min out of the two pairs
        for i in range(0,len(nums),2):
            sum+=nums[i]
        return sum
    
            