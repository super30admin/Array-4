# O(nlogn) time
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        n=len(nums)

        nums.sorted()
        result=0
        for i in range(0,n,2):
            result+=nums[i]

        return result

# [1,4,3,2]
# [1,2,3,4]
#. i


# O(n+k) time, where k is range of values in nums maxVal-minVal+1
# O(n) space
class Solution:
    def arrayPairSum(self, nums):
        n = len(nums)
        result = 0

        map = {}
        min_val = float('inf')
        max_val = float('-inf')

        for num in nums:
            # if num in the map, get it, otw 0 then add 1
            map[num] = map.get(num, 0) + 1
            min_val = min(min_val, num)
            max_val = max(max_val, num)
        #print(map)
        # [4, 1, 2, 4, 3, 4]
        # [1, 2, 3, 4, 4, 4]
        # {1: 1, 2: 1, 3: 1, 4: 3} original
        # {1: 1, 2: 1, 3: 1, 4: 3} current
        flag = False # T
        #i=4
        # result=8
        # i in range 1 to 5
        for i in range(min_val, max_val + 1):
            if i not in map:
                continue
            # when flag is true, that means next available number is the larger half of the pair, so it gets skipped
            for _ in range(map[i]):#1->3
                if not flag:
                    result += i
                
                # Switch turns! (True becomes False, False becomes True)
                flag = not flag

        return result
