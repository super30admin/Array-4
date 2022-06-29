// Time: O(Exponential) or O(N^N) && O(No of permutations)Log(No of permutations) | Space: O(N) - stack space O(No of permutation)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {
    List<Integer> list;
    boolean[] visited;
    public void nextPermutation(int[] nums) {
        list = new ArrayList<>();
        visited = new boolean[nums.length];
        // first we find all the permuation, put it in our list in the form of numbers
        helper(nums,  new ArrayList<>());
        // sort the list
        Collections.sort(list);
        // convert our nums array elements to number
        int resultToCompareWith = 0;
        for(int k=0;k<nums.length;k++) {
            resultToCompareWith = resultToCompareWith*10+nums[k];
        }
        int res = 0;
        int i=0;
        // once we sorted the list and created the resultToCompareWith
        // check if the last permutation in the list is greater or lesser to our resultToCompareWith
        // if we don't have to go through the list, directly can return the first element
        // else go through the list, take the number where we find the next maximum
        // mutate it through our original array
        if(list.get(list.size()-1) > resultToCompareWith) {
            while( i<list.size()) {
                if(list.get(i) > resultToCompareWith) {
                    res = list.get(i);
                    break;
                }
                i++;
            } }
        else
            res = list.get(0);

        i=nums.length-1;
        while(res !=0) {
            int unitDigit = res%10;
            nums[i] = unitDigit;
            res = res/10;
            i--;
        }
    }
    private void helper(int[] nums, List<Integer> path) {
        if(path.size() == nums.length) {
            int val = 0;
            for(int k=0;k<path.size();k++) {
                val = val*10+path.get(k);
            }
            list.add(val);
        }
        for(int i=0;i<nums.length;i++) {
            if(!visited[i]) {
                path.add(nums[i]);
                visited[i] = true;
                helper(nums,path);
                visited[i] = false;
                path.remove(path.size()-1);
            }

        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1,1,5};
        s.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));//[1, 5, 1]
        int[] nums1 = {3,2,1};
        s.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));//[1, 2, 3]
        s.nextPermutation(nums1);
        System.out.println(Arrays.toString(nums1));
    }
//[115, 115, 151, 151, 511, 511]
//        [1, 5, 1]
//        [123, 132, 213, 231, 312, 321]
//        [1, 2, 3]
//        [123, 132, 213, 231, 312, 321]
//        [1, 3, 2]
}



//optimised soln | Time: O(N) | Space: O(1)
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i=n-2;
        // finding the breach
        while(i>=0) {
            if(nums[i] < nums[i+1])
                break;
            i--;
        }
        // finding the next largest element amongst the right half of breach index
        // swap
        if(i>=0) {
            int j=n-1;
            while( nums[i]>=nums[j]) {
                j--;
            }
            swap(nums,i,j);
        }
        // reverse the rest of the array from breach index to get the smallest number
        reverse(nums,i+1,n-1);

    }

    public void reverse(int[] arr, int start, int end) {
        int i = start;
        int j = end;
        while(i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}