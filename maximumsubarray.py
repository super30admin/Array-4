class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        # find prev sum and if it is less than zero, it will always reduce the sum , so discard sum till there and let prevsum = curr element,else add curr to prevsum
        #TC-O(n),SC-O(1)
        n=len(nums)
        prevsum = nums[0]
        maxsum = nums[0]
        start=0
        end=0
        tempstart=0
        tempend=0
        for i in range(1,n):
            if prevsum < 0:
                prevsum = nums[i]
                tempstart=i
                tempend=i
            else:
                prevsum+=nums[i]
                tempend+=1
            if(prevsum>maxsum):
                maxsum=prevsum
                start=tempstart
                end=tempend
        print(start,end)
        return maxsum
