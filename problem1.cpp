
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
public:
    int arrayPairSum(vector<int>& nums) {
        int n = nums.size();
        int sum = 0;
        sort(nums.begin(),nums.end());
        for(int i = 0;i<n;i+=2){
            sum+=nums[i];
        }
        return sum;
    }
};

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

// using count sort 

class Solution {
public:
    const int k = 10000;
    int arrayPairSum(vector<int>& nums) {
        int dp[2*k + 1];
        memset(dp,0,sizeof dp);
        int n = nums.size();
        for(int i = 0;i<n;i++){
            dp[nums[i] + k]++;
        }
        int sum = 0;
        bool evenIndex = true;
        for(int i = 0;i<=2*k;i++){
            while(dp[i]){
                if(evenIndex){
                    sum+= i-k;
                }
                evenIndex = !evenIndex;
                dp[i]--;
            }
        }
        return sum;
    }
};