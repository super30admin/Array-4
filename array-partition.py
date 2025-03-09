# Approach 1
# tc O(n+k), sc O(k), using counting sort, where n is len(nums) and k is 10000,
# as the element in nums can be -10^4 to 10^4.
K = 10000
frequencies = [0] * (2 * K + 1)

for num in nums:
    frequencies[num+K] += 1

maxsum = 0
is_even_idx = True

for num in range(2*K+1):
    while frequencies[num] > 0:
        if is_even_idx:
            maxsum += num - K
        
        is_even_idx = not is_even_idx
        frequencies[num] -= 1

return maxsum

# Approach 2
# tc O(n log n + n = n log n), sc O(n, for python sort() takes external O(n) even though its in place sorting).
# nums.sort()

# maxsum = 0
# for idx in range(0, len(nums), 2):
#     maxsum += nums[idx]

# return maxsum