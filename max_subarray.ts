// TC: O(n) SC: O(1)
function maxSubArray(nums: number[]): number {
  let currentSum: number = Number.MIN_SAFE_INTEGER;
  let maxSum: number = Number.MIN_SAFE_INTEGER;

  let start: number = 0;
  let end: number = 0;
  let currentStart: number = 0;

  for (let idx = 0; idx < nums.length; idx++) {
    currentSum = Math.max(currentSum + nums[idx], nums[idx]);
    if (currentSum > maxSum) {
      maxSum = currentSum;
      start = currentStart;
      end = idx;
      currentStart = start;
    }
  }

  return maxSum;
}

function maxCrossingSum(
  nums: number[],
  left: number,
  mid: number,
  right: number,
  depth: number
): number {
  // Max sum on the left of the midpoint

  console.log(
    "maxCrossingSum :" +
      " Depth: " +
      depth +
      " Left: " +
      left +
      " Mid: " +
      mid +
      " Right:" +
      right
  );
  let leftSum = -Infinity;
  let tempSum = 0;
  for (let i = mid; i >= left; i--) {
    tempSum += nums[i];
    leftSum = Math.max(leftSum, tempSum);
  }

  // Max sum on the right of the midpoint
  let rightSum = -Infinity;
  tempSum = 0;
  for (let i = mid + 1; i <= right; i++) {
    tempSum += nums[i];
    rightSum = Math.max(rightSum, tempSum);
  }

  // Combine left and right sums
  return leftSum + rightSum;
}

function maxSubarrayDivideAndConquer(
  nums: number[],
  left: number,
  right: number,
  depth: number
): number {
  // Base case: single element
  if (left === right) {
    return nums[left];
  }

  // Find the middle point
  const mid = Math.floor((left + right) / 2);

  console.log(
    "maxSubarrayDivideAndConquer -> LeftCall :" +
      " Depth: " +
      depth +
      " (Left: " +
      left +
      " Mid: " +
      mid +
      " Right:" +
      right +
      ")"
  );

  // Recursively find the maximum subarray in left, right, and crossing
  const leftMax = maxSubarrayDivideAndConquer(nums, left, mid, depth + 1);
  console.log(
    "maxSubarrayDivideAndConquer -> RightCall :" +
      " Depth: " +
      depth +
      " (Left: " +
      left +
      " Mid: " +
      mid +
      " Right:" +
      right +
      ")"
  );
  const rightMax = maxSubarrayDivideAndConquer(nums, mid + 1, right, depth + 1);
  const crossMax = maxCrossingSum(nums, left, mid, right, depth + 1);

  // Return the maximum of the three
  return Math.max(leftMax, rightMax, crossMax);
}

function maxSubarray_DivideAndConquer(nums: number[]): number {
  if (nums.length === 0) return 0;
  return maxSubarrayDivideAndConquer(nums, 0, nums.length - 1, 0);
}

// https://leetcode.com/problems/maximum-subarray/description/
describe("53. Maximum Subarray", () => {
  it("Happy Path", () => {
    expect(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4])).toStrictEqual(6);
  });

  it("Happy Path", () => {
    expect(maxSubArray([-2])).toStrictEqual(-2);
  });

  it("Happy Path", () => {
    expect(
      maxSubarray_DivideAndConquer([-2, 1, -3, 4, -1, 2, 1, -5, 4])
    ).toStrictEqual(6);
  });

  it("Happy Path", () => {
    expect(maxSubarray_DivideAndConquer([-2])).toStrictEqual(-2);
  });
});
