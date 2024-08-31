# Solution

# // Time Complexity :  O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# Start from the right and find the position where the number decreases,
# if the number decreases then that is the point where we can make a change. Swap that
# with the immediate number and then perform reversing of that part of the string.
# https://www.youtube.com/watch?v=MNrJnduBkAE

def reverse(outS,i,j):
        while j>i:
            temp = outS[i]
            outS[i] = outS[j]
            outS[j] = temp

            i += 1
            j -= 1

def nextPermutation(nums):
    """
    Do not return anything, modify nums in-place instead.
    """
    n = len(nums)
    i = n-1
    j = n-2
    while j >= 0:
        if nums[j]<nums[i]:
            i = n-1
            while i>j:
                if nums[i]>nums[j]:
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                    reverse(nums,j+1,n-1)
                    break
            
                i -= 1
            break
        
        i -= 1
        j -= 1
    
    if j<0:
        reverse(nums,0,n-1)

if __name__ == "__main__":
     nums = [1,2,3]
     nextPermutation(nums)
     print(nums)