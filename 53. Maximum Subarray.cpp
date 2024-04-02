//Time: O(n)
//Space: O(n)

//Approach: Kadane's Algorithm

class Solution {
public:    
    int maxSubArray(vector<int>& nums) {
        int maxi = -1e9;
        int sum = 0;
        
        for(int u: nums){
            sum += u;
            maxi = max(sum,maxi);
            sum= max(sum,0);
        }
        
        return maxi;
    }
};


