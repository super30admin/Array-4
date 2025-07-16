"""
Count the frequency of each number using an array
Simulate forming pairs by taking every other number (i.e., alternate counts) to maximize the sum of mins
Every first element of a pair contributes to the final sum
"""
"""
Time Complexity : O(n + k) where k = 20001
Space Complexity : O(k)
"""


class arrayPartition:
    def arrayPairSum(self, nums: list[int]) -> int:
        freq = [0] * 20001
        for num in nums:
            freq[num + 10000] += 1

        total = 0
        take = True

        for i in range(20001):
            while freq[i] > 0:
                if take:
                    total += i - 10000
                take = not take
                freq[i] -= 1

        return total

if __name__ == "__main__":
    obj = arrayPartition()
    print(obj.arrayPairSum([1, 4, 3, 2])) 
