/**
 Do not return anything, modify nums in-place instead.
 */
function nextPermutation(nums: number[]): number[] {
  function swap(i: number, j: number) {
    let temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
  function reverse(from: number, to: number) {
    let left = from;
    let right = to;
    while (left < right) {
      swap(left, right);
      left++;
      right--;
    }
  }
  // Find the breach.
  let breachIdx = -1;
  for (let i = nums.length - 1; i > 0; i--) {
    if (nums[i] > nums[i - 1]) {
      breachIdx = i - 1;
      break;
    }
  }
  if (breachIdx == -1) {
    reverse(0, nums.length - 1);
  } else {
    // Find the next slow number
    let slowIdx = 0;
    for (let i = nums.length - 1; i > breachIdx; i--) {
      if (nums[i] > nums[breachIdx]) {
        slowIdx = i;
        break;
      }
    }
    // Swap the breach and slow number

    swap(breachIdx, slowIdx);

    // Reverse the array from breach+1 to end
    let left = breachIdx + 1;
    let right = nums.length - 1;
    reverse(left, right);
  }

  return nums;
}

// https://leetcode.com/problems/next-permutation/
describe("31. Next Permutation", () => {
  it("Happy Path", () => {
    expect(nextPermutation([1, 4, 3, 2])).toStrictEqual([2, 1, 3, 4]);
  });

  it("Happy Path", () => {
    expect(nextPermutation([3, 2, 1])).toStrictEqual([1, 2, 3]);
  });
  it("Happy Path", () => {
    expect(nextPermutation([1, 2, 3])).toStrictEqual([1, 3, 2]);
  });
});
