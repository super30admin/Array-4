"""
Problem : 1

Time Complexity : 
Bruteforce - O(nlogn)
Bucket Sort - O(n)

Space Complexity : 
Bruteforce - O(1)
Bucket Sort - O(n)


Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Bucket Sort - 
Finding the minimum and maximum in the array and counting the number of occurences of each number in the hashmap
starting from the minimum number, till maximum number is achieved, checking if the number exists in the hashmap,
if yes, decreasing its counter and increasing, checking for the next number, if the index of number is even, adding it to result

"""

# Array Partition

# Approach - 1
# Bruteforce

class Solution(object):
    def arrayPairSum(self,nums):
        nums.sort()
        result=0

        for i in range(0,len(nums)-1,2):
            result+=nums[i]
        return result

# Approach - 2
# Bucket
class Solution(object):
    def arrayPairSum(self,nums):
        # nums.sort()
        # result=0

        # for i in range(0,len(nums)-1,2):
        #     result+=nums[i]
        # return result
        minn=nums[0]
        maxx=nums[0]
        hmap={}
        for i in range(len(nums)):
            minn=min(minn,nums[i])
            maxx=max(maxx,nums[i])
            if nums[i] not in hmap:
                hmap[nums[i]]=0
            hmap[nums[i]]+=1

        j=0
        result=0
        i=minn
        while i>=minn and i<=maxx:
            if i in hmap:
                if j%2==0:
                    result+=i
                hmap[i]-=1
                if hmap[i]==0:
                    hmap.pop(i)
                j+=1
            if i not in hmap:
                i+=1
        return result
