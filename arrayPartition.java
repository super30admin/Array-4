/*

Double Pass Linear Order Sol 

Passed All Test Cases 

Time-> O(N)
Space-> O(1)
where N is # of elements in array 

*/



class Solution {
    public int arrayPairSum(int[] nums) {
        //we make array of size 20001 to cover the integers of ranges -10k to 10k 
        int [] storeFreq = new int[20001] ; 
        
        //populate the array 
        for(int val : nums) {
            
            //we add 10k to make the array populate indices ranging from 0 to 20k 
            storeFreq[val + 10000]++; 
        }
        
        int sum = 0 , tag = 1 ; 
        //tag is used to take care of odd even indices in the sorted freq array as well as elements occuring more than 1
        //now we iterate over array and get the sum 
        
        //we take i = -10k to take index 0 representing freq of num -10k
        for(int i = -10000 ; i < 10001 ; i++) {
            //we add 10k to make indices start from 0 
            sum += (storeFreq[i + 10000] + tag) / 2 * i ;
            
            //we update tag, to jump odd indices as well as to count even multiple freq of a element into a sum and leave the unpaired one aside 
            tag = (storeFreq[i + 10000] + tag) % 2 ; 
        }
        
        return sum ; 
    }
}



/*

Passed All Test Cases 

Sorting the array approach 

Time-> O(N log N)
Space-> O(1)

where N is # of elements in the array 

*/

class Solution {
    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) return 0 ; 
        
        //sorting the array 
        Arrays.sort(nums) ; 
        
        int sum = 0 ; 
        
        for(int i = 0 ; i < nums.length ; i++) {
            if(i % 2 == 0)
                sum += nums[i] ; 
        }
        
        return sum ; 
    }
}