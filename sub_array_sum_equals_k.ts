// TC: O(n) SC: O(n) 
function subarraySum(nums: number[], k: number): number {
  let map: Map<number, number> = new Map();
  let count = 0;
  let sum = 0;
  map.set(0, 1);

  for (let i = 0; i < nums.length; i++) {
    sum = sum + nums[i];
    let remain = sum - k;
    count += map.get(remain) ?? 0;
    map.set(sum, (map.get(sum) ?? 0) + 1);
  }
  return count;
}
describe("560. Subarray Sum Equals K", () => {
  it("Happy Path", () => {
    expect(subarraySum([1, 1, 4, 2, 3], 2)).toStrictEqual(2);
  });

  it("Happy Path", () => {
    expect(subarraySum([-1, -1, 1], 0)).toStrictEqual(1);
  });
});
