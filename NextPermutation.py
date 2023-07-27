from typing import List

class Solution:
    def nextPermutation(self, num: List[int]) -> None:
        n = len(num)
        i = n-2
        while i >= 0 and num[i+1] <= num[i]:
            i -=1

        if i >=0:
                j = n - 1

                while j > i and num[j] <= num[i]:
                    j -=1
                num[i], num[j] = num[j], num[i]
        num[i + 1:] = reversed(num[i + 1:])