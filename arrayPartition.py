
#Time Complexity: O(NlogN)
#Space Complexity: O(N)
#Run on Leetcode: Yes
#Any Issues: No


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        answer = 0
        i = (len(nums) - 1)
        while (i > 0): 
			# because it's sorted, we only need every other value
            answer += nums[i-1]
            i -= 2
        return answer
        