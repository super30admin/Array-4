'''
T = O(2n)
S = O(n)

Approach:
Create a Maxheap for the given array, After every two heappop operation
add the second poped value  to the sum to get the answer
'''

from heapq import heappop, heappush, heapify
class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        heap = []
        heapify(heap)
        for i in nums:
            heappush(heap, -1 * i)
        Sum = 0
        while heap:
            num1 = heappop(heap)
            num2 = heappop(heap)
            Sum = Sum + num2 * -1
        return Sum
		
'''
T = O(nlogn + logn)
S = O(1)

Approach:
Sort the given array and sum the even index elements that will denote the min number in any pair
'''


class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums.sort()
        Sum = 0
        for i in range(0,len(nums),2):
            Sum += nums[i]
        return Sum