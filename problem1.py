# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : YES

# Any problem you faced while coding this : NO

class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        freq = {}

        min_el, max_el = 10001,0

        for num in nums:
            min_el = min(min_el, num)
            max_el = max(max_el, num)
            freq[num] = 1 + freq.get(num, 0)
        

        res = 0
        seen = 0
        for i in range(min_el, max_el+1):
            if i not in freq:
                continue
            
            if seen % 2 != 0:
                # skip first occurance
                seen += 1
                freq[i] -= 1
            
            cur_count = freq[i]
            if cur_count % 2 == 0:
                added_count = cur_count // 2
            else:
                added_count = (cur_count // 2) + 1

            res += added_count * i
            seen += cur_count
        
        return res