/**
Intuition:
Scan from right to left to find the first number that breaks the decreasing order — this is where we can make the permutation bigger.
Swap it with the smallest number on its right that is greater than it (to make it just slightly larger).
Reverse the part after it to make the suffix as small as possible.
T.C: O(n)
S.C: O(1)

 */
var nextPermutation = function (nums) {
    // itearte over nums
    let n = nums.length;
    let i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    // breach
    if (i >= 0) {
        let j = n - 1;
        while (nums[i] >= nums[j]) {
            j--;
        }
        // swap
        [nums[i], nums[j]] = [nums[j], nums[i]];
    }

    // Reverse only the suffix (i+1 to end)
    let left = i + 1;
    let right = n - 1;

    while (left < right) {
        [nums[left], nums[right]] = [nums[right], nums[left]];
        left++;
        right--;
    }
};