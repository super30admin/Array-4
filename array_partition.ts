// Bucket Sort
function arrayPairSum(nums: number[]): number {
  let frequency: Map<number, number> = new Map();

  let min: number = Number.MAX_VALUE;
  let max: number = Number.MIN_VALUE;
  for (const num of nums) {
    min = Math.min(min, num);
    max = Math.max(max, num);
    frequency.set(num, (frequency.get(num) || 0) + 1);
  }

  let result: number = 0;
  let flag = false;
  for (let i = min; i <= max; i++) {
    if (!frequency.has(i)) continue;
    let count = frequency.get(i)!;
    if (flag == true) {
      count -= 1;
      flag = false;
    }
    let freq:number = Math.floor(count / 2);
    if (count % 2 == 0) {
      result += i * freq;
    } else {
      flag = true;
      result += i * freq + i;
    }
  }
  return result;
}

// https://leetcode.com/problems/array-partition/
describe("561. Array Partition", () => {
  it("Happy Path", () => {
    expect(arrayPairSum([1, 4, 3, 2])).toStrictEqual(4);
  });
});
