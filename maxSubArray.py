'''
Time Complexity :O(n) 
Space Complexity :O(n)
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this :no
'''
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        
        # use running sum approach
        runningSumList = [nums[0]]
        
        # return the maxRunningSum
        maxRunningSum = runningSumList[-1]
        
        # startPivot
        start = 0
        
        # endPivot
        end = 0
        
        # iterate the numsList
        for idx in range(1,len(nums)):
            
            # find the maxima
            maxima = max(runningSumList[-1]+nums[idx],nums[idx])
            
            # to set the start pivot
            if runningSumList[-1]+nums[idx] < nums[idx]:
                start = idx
                end = idx
                
            # append to the runningSumList
            runningSumList.append(maxima)
            
            # to set the end pivot
            if maxRunningSum < maxima:
                end = idx
            
            # chk if this can be maxRunningSum
            maxRunningSum = max(maxRunningSum,runningSumList[-1])
            
        # print the running sum
        print("Running Sum List:\t",runningSumList)
        print("Max running sum is:\t",maxRunningSum)
        print("Start is:\t",start)
        print("End is:\t",end)
        print("Max subArray is:\t",nums[start:end+1])
        
        return maxRunningSum
            