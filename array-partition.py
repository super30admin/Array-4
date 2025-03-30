# Time O(n) n unique element
# Space O(n)
import math
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        minN = math.inf
        maxN = -math.inf
        dictN = defaultdict(int)
        for num in nums:
            minN = min(minN, num)
            maxN = max(maxN, num)
            dictN[num] += 1

        result = 0
        flag = True
        for i in range(minN, maxN+1):
            if i in dictN:
                if not flag: # if false
                    dictN[i] -= 1
                    flag = not flag # make it true
                count = dictN[i]
                if count % 2 == 0: #even
                    result += (count // 2) * i
                else:
                    result += (count // 2) * i
                    result += i
                    flag = not flag
        return result

# Time O(2n)
# Space O(n)              
import math
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        minN = math.inf
        maxN = -math.inf
        dictN = defaultdict(int)
        for num in nums:
            minN = min(minN, num)
            maxN = max(maxN, num)
            dictN[num] += 1

        result = 0
        flag = True
        for i in range(minN, maxN+1):
            if i in dictN:
                while dictN[i] > 0:
                    if flag:
                        result += i
                    dictN[i] -= 1
                    flag = not flag
        return result
                