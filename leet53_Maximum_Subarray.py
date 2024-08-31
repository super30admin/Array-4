# Solution

# // Time Complexity :  O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# Have a local maximum and global maximum, keep updating local maximum whenever
# summing with a number increases it or starting from a new position if new number is
# bigger, as and when local maximum increases than global maximum then update global maximum
# https://www.youtube.com/watch?v=MNrJnduBkAE

# Also has logic to get indices of start and end of subarray

def maxSubArray(nums):
    # S30 Solution
    localMax = nums[0]
    globalMax = nums[0]
    curStart = 0
    start = 0
    end = 0

    for i in range(1,len(nums)):
        if nums[i] > localMax+nums[i]:
            localMax = nums[i]
            curStart = i
        else:
            localMax = localMax+nums[i]

        if localMax > globalMax:
            globalMax = localMax
            start = curStart
            end = i
    
    print(start,end)
    
    return globalMax

if __name__ == "__main__":
    nums = [-2,1,-3,4,-1,2,1,-5,4]
    print(maxSubArray(nums))