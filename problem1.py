#Array-Partition-1
#TC:O(N) where n is len of nums
#SC:O(1)


class Solution(object):
    def arrayPairSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        res = [0]*20001
        for x in nums:
            res[x+10000] += 1
        s_so_far, adjust = 0, False
        for idx, freq in enumerate(res):
            if freq:
                freq = freq-1 if adjust else freq
                if freq&1:
                    s_so_far += ((freq//2) + 1)*(idx-10000)
                    adjust = True
                else:
                    s_so_far += ((freq//2))*(idx-10000)
                    adjust = False
        return s_so_far