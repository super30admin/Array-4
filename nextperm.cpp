//TC: O(n)
//SC: O(1)

class Solution {
public:
    
    
    void swap(vector<int>&nums, int i, int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    
    
    void reverse(vector<int>&nums, int i){
        int j = nums.size()-1;
        while(i < j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    
    void nextPermutation(vector<int>& nums) {
        
        //first find the point at which we need to get the next permutation. This is obtained by identifying the first point from the right which follows ascending order. 
        //reason is if the digits are in descending order then we have reached the largest number. The point at which the digits are in ascending order is where we can get the next largest number/next permutation
        
        int i = nums.size()-1;
        while(i >=1){
            if(nums[i] > nums[i-1])
                break;
            i--;
        }
        
        //if the input is the largest permutation, then we return the reverse, which is the ascending order
        if(i == 0){
            reverse(nums, 0);
            return;
        }
        
        //since from nums.size()-1 to i-1, the numbers are in descending order, if we iterate from the right, the first number that is greater than nums[i-1] is the answer we want.
        int j = nums.size()-1;
        
        while(j > i-1){
            //if nums[j] > nums[i-1], we break, cause this is where the swap will happen.
            if(nums[j] > nums[i-1]){
                break;
            }
            j--;
        }
        
        //we then swap with i-1 and j        
        swap(nums, i-1, j);
        
        //since we know every element from i-1 to n is already in descending order, to get the next permutation, we have to simply reverse the elements from i to n.
        reverse(nums, i);   
    }
};