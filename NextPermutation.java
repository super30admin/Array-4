// did not get this solution -> go over again and attempt to solve properly
// only know the steps
// take i to the index where nums[i] < nums[i+1]
// if i is greater than 0 that means a lexicographical order exists
// so we find j from the end such that nums[j] > nums[i] (1st large number from the end)
// we swap the two values
// if not then just reverse the array and return cause original is in descending order
// i don't know why this works
// TC: O(n)
// SC: O(1)

//takeaways : video : https://www.youtube.com/watch?v=quAS1iydq7U&ab_channel=BackToBackSWE
// if it's in a strictly decreasing order -> we are on the last permutation
// if we are in strictly increasing order -> we are on the first permutation

// with every decision space we plant a decision, in the remaining spaces we want to plant digits in increasing order
// and backtrack and then mark the previous space the increasing element
// eg: 1,2,3 -> we have rooted 1 at position 0, 2 at position 1 and 3 at position 2
// now move backward from position 2 and pull out 3, position 2 is empty { say 3 is now in our decision space}
// now move to position 1, pull out 2, position 1 is empty {2 and 3 are in decision space}
// stop at this iteration
// see if we have ever added 3 at position 1, if not then add 3 and move to position 2
// add 2 to position 2 and now permutation is -> 1,3,2
// continue scanning from right to left like above and you will observe you are at position 0 with decision space {2,3,1}
// now at position 0 plant the next greatest element of 1 that is 2
// come at position 1 plant the smallest among 3 and 1 -> so 1 and last 3 -> permutation -> 2,1,3
// repeat above and new permutation -> 2,3,1 -> 3,1,2 -> 3,2,1

//for instance we are given the input as 6,2,1,5,4,3,0 -> we should know we are the last permutation and return the reverse of the following subarry, in the above case from position 2 {value = 1}
// so here -> replace value at position 2 with the next greatest element from right of 1 that is 3
// we get -> 6,2,3 {for the remaining spaces, add small to large}
// 6,2,3,0,1,4,5 -> 6,2,3,1,0,4,5 -> 6,2,3,4,0,1,5 and so on..

class Solution {

  public void nextPermutation(int[] nums) {
    int i = nums.length - 2; // i = 5

    // find the last non-decreasing element
    //eg: 6,2,1,5,4,3,0
    while (i >= 0 && nums[i] >= nums[i + 1]) {
      i -= 1;
    }
    // now -> i = 2

    //once found
    // we want to replace ith position with next greatest element from the right
    if (i >= 0) {
      // j is at last index
      int j = nums.length - 1;
      // j is at position 5
      while (j >= 0 && nums[j] <= nums[i]) {
        j -= 1;
      }

      // switch position of 0 and 1
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
    // nums -> [6, 2, 3, 5, 4, 1, 0]

    int start = i + 1; // start = 3
    int end = nums.length - 1; // end = 6

    // reverse the remaining subarray
    while (start < end) {
      // Swap elements
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;

      // Move pointers
      start++;
      end--;
    }
  }
}
