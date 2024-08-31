# Solution

# // Time Complexity :  Dict Approach - O(N)
#                       Sorting Approach - O(NLOGN)
# // Space Complexity : Dict Approach - O(N)
#                       Sorting Approach - O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach
# For both approaches basic logic is, always try to make pairs such that small numbers are together
# and big numbers are together, so that when we take minimum in big numbers since both will be big
# though we take minimum there, it will be bigger, so the sum will be bigger.
# Example: 1,6,3,7,4,8
# Here if we make pairs like (1,6),(3,7),(4,8) we will only be taking 1,3,4 and sum will be less
# instead if we make 1,3,4,6,7,8 and take (1,3),(4,6),(7,8) we will be taking 1,4,7 giving a bigger sum
# https://www.youtube.com/watch?v=MNrJnduBkAE

import math
def arrayPairSum(nums):
    # O(n) approach
    n = len(nums)
    dict = {}
    min = math.inf
    max = 0

    for i in range(n):
        if nums[i] in dict:
            dict[nums[i]] += 1
        else:
            dict[nums[i]] = 1
        
        if min > nums[i]:
            min = nums[i]
        
        if max < nums[i]:
            max = nums[i]
    
    print(dict)

    sum = 0
    flag = False
    for i in range(min,max+1):
        if i in dict:
        
            if flag == True:
                dict[i] -= 1
                flag = False

            n = dict[i]%2
            d = math.floor(dict[i]/2)

            sum += i*d
            if n == 0:
                del dict[i]
            elif i != max:
                sum += i
                del dict[i]
                flag = True
    
    return sum

# O(nlogn) approach since we are sorting
    # nums.sort()
    # n = len(nums)
    # i = 0
    # sum = 0
    # while i<n:
    #     sum += nums[i]
    #     i += 2
    
    # return sum