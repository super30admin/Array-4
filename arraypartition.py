# Brute Force Solution
# since the numbers are between a range, we can keep the count of occurence of each number.
# explore all the possible paths.
# time complexity - O(n^n)
# space complexity - O(n^n) 
# did this code run on leetcode? - no (TLE)   
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        self.max_sum = float('-inf')
        self.rec(nums, 0, len(nums)//2)
        return self.max_sum    
            
    def rec(self, nums, path_sum, n):
        # print(nums, n)
        if n==0:
            self.max_sum = max(self.max_sum, path_sum)
        else:
            # explore all the paths.
            for i in range(1,len(nums)):
                self.rec(nums[1:i]+nums[i+1:], path_sum+min(nums[0], nums[i]), n-1)


# Sort the array
# Group neighboring elements and select every alternate element beginning from index 0 that is the minimum element of the group.
# Return the maximum sum.
# time complexity - O(nlogn)
# space complexity - O(1)
# did this code run on leetcode? - yes
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        maxsum = 0
        nums.sort() # sort the array
        n = len(nums)
        
        for i in range(0, n, 2):
            maxsum += nums[i]
            
        return maxsum
    
    
# Since the numbers are between a range, we can keep the count of occurence of each number.
# time complexity - O(n)
# space complexity - O(n) 
# did this code run on leetcode? - yes
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        cnums = [0] * 20001
        
        # keep the count of occurence of each number.
        # O(m)
        for num in nums:
            cnums[num+10000] += 1
        
        # O(n) - where n is the length of cnums=20000
        maxsum = 0
        flag = 1
        for i in range(20001):
            num = cnums[i]
            while num:      # count of occurence of a number. 
                if flag:    # add every alternate number to the maximum sum.
                    maxsum += i-10000
                flag ^= 1
                num -= 1
        return maxsum       # return the maximum sum
        

