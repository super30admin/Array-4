#S30 Problem #123 Array Partitions
#LeetCode #561 https://leetcode.com/problems/array-partition/

# Author : Akaash Trivedi

# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# pair the max numbers together to get maximized sum 
# sort the array and add every alternate number starting from 0 index. index: 0,2,4...
# Time Complexity : O(n log n)
# Space Complexity : O(1)
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        maxz = 0
        for i in range(0,len(nums),2):
            maxz += nums[i]
        return maxz

    
# bucket/count sort

# idea: pair the max numbers together to get maximized sum. 
# bucket/count sort: store the frequency in hashmap + have maximum and minimum
# iterate between minimum and maximum. Start from mimimum and add to result & decrement the count
# maintain a flag whether to skip the next element. True decrement count & dont add to result, turn flag to false. Check the count, if 0 then go to next elemet
# Time complexity: O(max(range(min,max) , n)) linear
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        minn = min(nums)
        maxn = max(nums)
        hashm = {}
        res = 0
        for i in range(len(nums)):
            hashm[nums[i]] = hashm.get(nums[i],0) + 1
        
        flag = False # to skip or not: (True means skip OR add to res if False)
        # iterator between min and max
        for i in range(minn, maxn+1):
            if i not in hashm:
                # if we dont have i in nums
                continue
            # get the frequency/count of current number
            currFreq = hashm[i]
            while currFreq > 0:
                if not flag:
                    res += i
                flag = not flag
                currFreq -= 1
            del hashm[i]
        return res

# bucket/count sort + modulo logic

# idea: pair the max numbers together to get maximized sum. 
# bucket/count sort: store the frequency in hashmap + have maximum and minimum
# iterate between minimum and maximum using modulo to handle freq/count
# maintain a flag whether to skip: use freq%2 with flag to determine how many numbers to take
# When skip=False: take ceil(count/2)=(count+1)//2 numbers (1st,3rd,5th occurrences)
# When skip=True: take floor(count/2)=count//2 numbers (2nd,4th,6th occurrences)  
# Flag update: odd count flips skip state, even count preserves it
# Time complexity: O(max(range(min,max) , n)) linear
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        minn = min(nums)
        maxn = max(nums)
        hashm = {}
        res = 0
        for i in range(len(nums)):
            hashm[nums[i]] = hashm.get(nums[i],0) + 1
        
        skip = False # to skip or not - current number
        # iterator between min and max
        for i in range(minn, maxn+1):
            if i not in hashm:
                # if we dont have i in nums
                continue

            # get the frequency/count of current number
            currFreq = hashm[i]
            
            if not skip:
                # not skipping, so take ceil(currFreq/2) of number
                res += (currFreq+1) // 2 * i
                # currFreq is odd skip the next number, (skip is True)
                skip = currFreq % 2 == 1
            else:
                # skipping so take floor of number
                res += currFreq // 2 * i
                # if currFreq is odd, stop skipping (take the extra number)
                skip = not (currFreq % 2 == 1)
        return res
