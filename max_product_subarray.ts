// TC: O(2N) SC: O(1)
function maxProduct(nums: number[]): number {
  if (nums.length == 0) return -1;
  if (nums.length == 1) return nums[0];

  let max = Number.MIN_SAFE_INTEGER
  let currentMin = 1;
  let currentMax: number = 1;

  for (const num of nums) {
    let temp = currentMax * num;
    currentMax = Math.max(currentMin * num, currentMax * num, num); // max(2*3, 3) = 6
    currentMin = Math.min(currentMin * num, temp, num); // min(2*3, 3) = 3
    max = Math.max(currentMax, currentMin, max);
    console.log(
      "Temp: " +
        temp +
        " Max: " +
        currentMax +
        " Min: " +
        currentMin +
        " MaxFinal: " +
        max
    );
  }

  return max;
}

describe("152. Maximum Product Subarray", () => {
  it("Happy Path", () => {
    expect(maxProduct([2, 3, -2, 4])).toStrictEqual(6);
  });

  it("Negative Values", () => {
    expect(maxProduct([-2, 3, -4])).toStrictEqual(24);
  });

  it("Value with 0 Values", () => {
    expect(maxProduct([2, 0])).toStrictEqual(2);
  });

  it("Value with 0 at 1st position", () => {
    expect(maxProduct([0, 2])).toStrictEqual(2);
  });
});
