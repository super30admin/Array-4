// Time Complexity : O(N) #of elements
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 


// Your code here along with comments explaining your approach:
// 1. If we traverse from right to left value should be increasing till some element 'x'. 
// 2. Hence all elements on right side of x is in its max permutation combined. Swap x with element just greater than it on left of x.
// 3. Lastly reverse all elements on right side of x after swapping which gives next permutation.

class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int n=nums.size(),pt=-1;
        for(int i=n-1;i>=0;i--){
            if( (i-1 >= 0) && (nums[i-1]<nums[i]) ){
                pt=(i-1);break;
            }
        }
        int t=pt+1,pointer2=pt;
        while(t<n){
            if(pt!=-1 && nums[t]<=nums[pt]){break;}
            pointer2=t;
            t++;
        }
        if(pt!=-1){
        int temp=nums[pt];nums[pt]=nums[pointer2];nums[pointer2]=temp;}
        int left=pt+1,right=n-1;
        cout<<left<<' '<<right<<'\n';
        while(left<right){
            int tp=nums[left];nums[left]=nums[right];nums[right]=tp;
            left++;right--;
        }

    }
};