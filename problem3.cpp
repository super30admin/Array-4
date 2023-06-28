// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// we always start iterating from backwards because we are interested in finding a smaller number and 
// replacing it with a larger number so that it would be become lexicographically larger.
// we first find the index at which smaller element is present and then we find the element
// greater than the smaller element towards its right side. and we swap them.
//     atlast we need to reverse the values from swapped index + 1 to end to get the next permutation. otherwise, we will get 
// alarger permutation but not the next one.

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n = nums.size();
        int index = -1;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        for(int i = n-1;i>index && index!=-1;i--){
            if(nums[i]>nums[index]){
                swap(nums[i],nums[index]);
                break;
            }
        }
        reverse(nums.begin()+index+1,nums.end());
    }
};

