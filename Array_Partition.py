# Time Complexity : O(Nlogn)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# Sort the array then iterate over the array and add the alternate elements to the sum
# Return sum
# Another Approach is Bucket Sort
# We will get the min and max elements in array and iterate i ranging from min to max+1. Also having HashMap for freq and setting flag to True
# Then check if i is in HashMap if it is then check the flag
# If the flag is True we will add i * freq/2 to result if the freq is even and i + i * freq/2 and set flag to False if odd
# If the flag is false then we will skip the i by reducing its freq
# Return result

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        result = 0
        for i in range(0, len(nums), 2):
            result += nums[i]
        return result

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        result = 0
        minnum = float('inf')
        maxnum = float('-inf')
        numdict = {}
        flag = True
        for num in nums:
            minnum = min(minnum, num)
            maxnum = max(maxnum, num)
            if num not in numdict:
                numdict[num] = 1
            else:
                numdict[num] += 1
        for i in range(minnum, maxnum+1):
            if i in numdict:
                freq = numdict[i]
                if not flag:
                    freq -= 1
                    flag = True
                if freq % 2 == 0:
                    result += i * (freq//2)
                else:
                    result += i
                    result += i * (freq//2)
                    flag = False
                
        return result




