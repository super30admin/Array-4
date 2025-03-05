class Solution:
    # running sum technique
    # TC : O(n)
    # SC : O(1)
    def maxSubArray(self, nums: List[int]) -> int:
        if not nums:  # Direct check for empty list
            return 0

        runningSum = nums[0]
        maxsum = nums[0]
        start = end = s = 0  # s is used to track the potential start index

        for i in range(1, len(nums)):
            if runningSum + nums[i] > nums[i]:
                runningSum += nums[i]
            else:
                runningSum = nums[i]
                s = i  # Update start index when starting a new subarray

            if runningSum > maxsum:
                maxsum = runningSum
                start = s  # Update start to the new subarray beginning
                end = i  # Update end index

        print("start:", start, "end:", end)
        print("Max Subarray:", nums[start:end+1])  # Fix slicing issue
        return maxsum