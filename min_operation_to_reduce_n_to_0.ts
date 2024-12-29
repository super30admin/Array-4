function minOperations(nums: number[], x: number): number {
  let left = 0;
  let right = nums.length - 1;
  let operations: number = 0;
  while (x > 0 && left < right) {
    let leftDiff = 0 - x + nums[left];
    let rightDiff = 0 - x + nums[right];
    if (rightDiff < leftDiff) {
      x -= nums[right];
      right--;
    } else {
      x -= nums[left];
      left++;
    }
    operations++;
  }
  if (x != 0) return -1;
  return operations;
}

// Reverse thinking - instead of reaching to 0 find the total subtrack x from it and
function minOperationsSliding_window(nums: number[], x: number): number {
  let total = 0;
  for (const num of nums) {
    total += num;
  }
  let target = total - x;

  // normal sliding window
  let operation = -1;
  let runningSum = 0;
  let start = 0;
  for (let end = 0; end < nums.length; end++) {
    runningSum += nums[end];
    while (start <= end && runningSum > target) {
      runningSum -= nums[start];
      start++;
    }
    if (runningSum == target) {
      operation = Math.max(operation, end - start + 1);
    }
  }
  if (operation == -1) return -1;
  console.log("Operations: " + operation);
  return nums.length - operation;
}

describe("1658. Minimum Operations to Reduce X to Zero", () => {
  it("Happy Path", () => {
    expect(minOperationsSliding_window([1, 1, 4, 2, 3], 5)).toStrictEqual(2);
  });

  it("Happy Path", () => {
    expect(minOperationsSliding_window([3, 2, 20, 1, 1, 3], 10)).toStrictEqual(
      5
    );
  });
});
