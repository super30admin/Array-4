// Time Complexity : O(n)
// Space Complexity : O(nlogn) //No element found //O(2n)
// Any problem you faced while coding this :
//
// Your code here along with comments explaining your approach
//1. Go through the list once and check if any ccombination is possible
//2. If found swap the element with the least possible element
//3. Reverse the rest of the elements to get the minimum value
//4. When not found just sort the list

class Solution {
public:
    void reverse(vector<int> & result, int start, int end){
       // int start =0;
        while(start<end){
            swap(result[start], result[end]);
            start++;
            end--;
        }
    }
    
    void nextPermutation(vector<int>& nums) {
        //edge
        if(nums.size()==0)
            return;
        
        //logic
        bool flag=false;
        for(int i=nums.size()-2; i>=0;i--){
            //cout<<nums[i]<<" here1 "<<nums[i+1]<<endl;
            if(nums[i] < nums[i+1]){
               // cout<<nums[i]<<" here2 "<<nums[i-1]<<endl;
                for(int k=nums.size()-1; k>i; k--){
                    if(nums[i] < nums[k]){
                        swap(nums[i], nums[k]);
                       // cout<<nums[i]<<" "<<nums[k]<<endl;
                        reverse(nums, i+1, nums.size()-1);
                        flag=true;
                        break;
                    }
                }
                break;
            }
        }
        if(flag==false){
            sort(nums.begin(), nums.end());
        }
    }
};
