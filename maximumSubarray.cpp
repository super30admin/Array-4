/*
The idea is that we can start a subarray from the current Index or continue with previous subarray
///////////////////////////////////////////
Time Complexity : O(N), Total number of elements
Space Complexity : O(1)
*/
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for ( int i =1; i < nums.size(); i++){
            maxEndingHere = max( nums[i], nums[i]+ maxEndingHere);
            maxSoFar = max( maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
};

//With Indices
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        int startIndex = 0;
        int endIndex = 0;
        int currIndex = 0;
        for ( int i =1; i < nums.size(); i++){
            
            if ( nums[i] + maxEndingHere > nums[i]){
                maxEndingHere = nums[i] + maxEndingHere;
            }
            else{
                maxEndingHere = nums[i];
                currIndex = i;            
            }
            if ( maxEndingHere > maxSoFar){
                
                startIndex = currIndex;
                maxSoFar = maxEndingHere;
                endIndex = i;
            }
            maxEndingHere = max( nums[i], nums[i]+ maxEndingHere);
            maxSoFar = max( maxSoFar, maxEndingHere);
        }
        cout<<startIndex<<" "<<endIndex<<endl;
        return maxSoFar;
    }
};