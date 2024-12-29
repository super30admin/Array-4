function minSubArrayLen(target: number, nums: number[]): number {
  let start = 0;
  let total = 0;
  let result = nums.length + 1;

  for (let end = 0; end < nums.length; end++) {
    total += nums[end];
    while (total >= target) {
      result = Math.min(end - start + 1, result);
      total -= nums[start];
      start++;
    }
  }
  if (result == nums.length + 1) return 0;
  return result;
}

describe("209. Minimum Size Subarray Sum", () => {
  it("Happy Path", () => {
    expect(minSubArrayLen(7, [2, 3, 1, 2, 4, 3])).toStrictEqual(2);
  });

  it("Happy Path", () => {
    expect(minSubArrayLen(4, [1, 4, 4])).toStrictEqual(1);
  });

  it("Happy Path", () => {
    expect(minSubArrayLen(4, [1, 2, 1, 1, 1, 1])).toStrictEqual(3);
  });
});
