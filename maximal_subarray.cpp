// Time complexity-O(n)
// space complexity O(1);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// at each position  decide if the element should be added to the window or not

#include<algorithm>
#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max_sum=nums[0];int curr_sum=nums[0];
        int start=0 ;int end=1;
        for(int i=1; i<nums.size();i++){
            
            if(nums[i] > curr_sum+nums[i]){
                start=i;
            }
            
            
            curr_sum = max(nums[i]+curr_sum,nums[i]);
            
            if(curr_sum > max_sum){
                end++;
            }
            max_sum =max(curr_sum,max_sum);
            
        }
        cout<<start<<endl;
        cout<<end<<endl;
       return max_sum; 
    }
    
};