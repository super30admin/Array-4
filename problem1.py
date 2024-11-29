class Solution(object):
    def arrayPairSum(self, nums): #T.C -> O(range)
        """
        :type nums: List[int]
        :rtype: int
        """
        max_n = float('-infinity')
        min_n = float('infinity')
        result = 0
        bucket = {}

        for i in range(len(nums)):
            if nums[i] in bucket:
                bucket[nums[i]] +=1
            else:
                bucket[nums[i]] = 1
            max_n = max(max_n,nums[i])
            min_n = min(min_n,nums[i])
            flag = False
        for i in range(min_n,max_n+1):
            if i in bucket:
                if flag:
                    frq = bucket.get(i)
                    frq -=1
                    bucket[i] = frq
                freq = bucket.get(i)
                if freq % 2 == 0:
                    result += (freq // 2) * i
                    flag = False
                else:
                    result += ((freq - 1)//2) * i
                    result +=i
                    flag = True
        return result
        

class Solution(object):
    def arrayPairSum(self, nums): #T.C -> O(nlogn) + O(n)
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        result = 0

        for i in range(0,len(nums),2):
            result+=nums[i]
        return result