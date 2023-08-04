package problems.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Problem561 {
    public int arrayPairSum(int[] nums) {
        //TC=O(n)
        //SC=O(n)
        int min=nums[0];
        int max=nums[0];
        int sum=0;
        HashMap<Integer, Integer> numberFreq=new HashMap<>();
        for(int num: nums){
            min=Integer.min(min,num);
            max=Integer.max(max,num);
            numberFreq.put(num,numberFreq.getOrDefault(num,0)+1);
        }
        int j=0;
        int i=min;
        while(i>=min && i<=max){
            if(numberFreq.containsKey(i)){
                if(j%2==0)
                    sum+=i;
                numberFreq.put(i,numberFreq.get(i)-1);
                numberFreq.remove(i,0);
                j++;
            }
            if(!numberFreq.containsKey(i))
                i++;
        }
        return sum;
    }

    public int arrayPairSum1(int[] nums) {
    //TC=O(nlogn)
    //SC=O(1)
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum= sum+nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Problem561 problem=new Problem561();
        System.out.println(problem.arrayPairSum(new int[]{6,2,6,5,1,2}));
        System.out.println(problem.arrayPairSum1(new int[]{6,2,6,5,1,2}));
    }
}
