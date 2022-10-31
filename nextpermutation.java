//Tc nextpermutation O(n)
//SC O(1)
class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int k,j;
        for(k=nums.size()-2 ; k>=0 ; k--){                        
            if(nums[k]<nums[k+1])                   
                break;
        }
        if(k<0){
            reverse(nums.begin(),nums.end());           
        }
        else{
            for(j=nums.size()-1 ; j>k ; j--){        
                if(nums[j]>nums[k])
                    break;
            }
            swap(nums[k],nums[j]);                    
            reverse(nums.begin()+k+1,nums.end());      
        }
    }
};