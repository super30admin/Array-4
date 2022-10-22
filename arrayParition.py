#Time: O(nlogn)
#Space: O(1)

def findMax(nums):
    if nums is None or len(nums) == 0:
        return None
    
    nums.sort()
    i = 0
    result = 0
    while (i < len(nums)):
        result += min(nums[i], nums[i+1])
        i += 2
    
    return result
