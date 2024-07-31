# I used Kadane's Algorithm to efficiently determine the largest sum of any contiguous subarray within a given list of integers. The algorithm initializes maxsub with the first element of the array to handle edge cases where the array may consist of a single element. It maintains currsum to keep track of the sum of the current subarray. As the algorithm iterates through the list, it resets currsum to 0 whenever it becomes negative, ensuring that only positive sums contribute to the potential maximum. The maxsub variable is updated to the maximum of its current value and currsum after each iteration. This approach ensures that the largest sum of any contiguous subarray is found. The time complexity of this solution is O(N), where N is the number of elements in the list, due to the single pass through the array. The space complexity is O(1) since only a fixed amount of extra space is used regardless of the input size.

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxsub=nums[0]
        currsum=0
        for i in nums:
            if(currsum<0):
                currsum=0
            currsum+=i
            maxsub= max(maxsub,currsum)
        return maxsub