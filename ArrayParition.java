//using counting sort : TC : O(n+k) SC : O(n)
class Solution {
    public int arrayPairSum(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num , 1);
            }
            else{
                map.put(num , map.get(num) + 1);
            }
            if(num < min){min = num;}
            if(num > max){max = num;}
        }
        boolean flag = false;
        int sum = 0;
        for(int i = min ; i <= max ; i++){
           if(map.containsKey(i)){
            int count = map.get(i);
            while(count>0){
                if(flag == false){
                    sum+=i;

                }
                flag = !flag;
                count--;
            }
           } 
        }
        return sum;


            
    }
}

//Sorting Approach + pairing : TC : O(nlogn) , SC : O(1)
// class Solution {
//     public int arrayPairSum(int[] nums) {
//         Arrays.sort(nums); // 1 ,2 , 3, 4
//         //pair adj elements and find sum of first element in every pair
//         int sum = 0;
//         for(int i = 0 ; i < nums.length ; i+=2){
//             sum += nums[i];
//         }
//         return sum;

        
//     }
// }