"""
Approach1 brute force: form all the paris and find the max among them. (recursion + backtrack)
TC: n!
Approach2: sort the array, make pairs and among those select the minimum.
Why does this work?
(0,9) choose 0 and eliminate 9. what if 9 could be paired with 13, (9,13). THus, the number that should be paired
with 0 should also be minimum. Thus, it has be optimal number. Therefore. sort it.
TC: O(n log n) + O(n)

Approach3: using bucket sort
Form a freq map, traverse the map from min to max. For even freq: form 2 pairs, add that value 2 times,
For odd freq: add it even times and reduce the freq of next number, since the odd freq can form pair with
the next number.
We are iterating over the hmap and under the hood we are iterating over the buckets, so it called as bucket sort.
TC: O(min, max). It is used when numebrs are not very sparse
If they are use sorting one

%: remainder, /: floating-point division, //: Floor division
"""

class Solution_approach3:
    def arrayPairSum(self, nums: List[int]) -> int:
        hmap = {}
        min_n = float("inf")
        max_n = float("-inf")
        for num in nums:
            max_n =  max(max_n, num)
            min_n = min(min_n, num)
            if num not in hmap:
                hmap[num] = 0
            hmap[num] += 1

        ans = 0
        flag = True
        # be careful about the last number in range
        for num in range(min_n, max_n+1):
            # since it is range, check if num in hmap
            if num in hmap:
                # if it was an odd freq then decrement the freq by 1
                if not flag:
                    hmap[num] -= 1

                freq = hmap[num]
                if freq% 2 == 0: # check remainder
                    ans += num * (freq//2) # get the quotient as integer
                    flag = True
                else:
                    ans += num * (freq//2)
                    print(freq//2)
                    # since it is an odd number of occ, need to add it one more time
                    ans += num
                    print(ans)
                    flag = False

        return ans


class Solution_Approach2:
    def arrayPairSum(self, nums: List[int]) -> int:
        nums = sorted(nums)
        ans = 0
        for i in range(0, len(nums), 2):
            ans += nums[i]

        return ans