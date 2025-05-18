class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){ // O(n)
            myMap.put(num, myMap.getOrDefault(num, 0)+1);
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        int sum = 0;
        boolean flag = false;
        for(int i=min; i<=max; i++){ //O(range)
            if(myMap.containsKey(i)){
                if(flag)
                    myMap.put(i, myMap.get(i)-1);
                int count = myMap.get(i);
                if(count % 2 == 0)
                    {
                        flag = false;
                        sum += (count/2)*i;
                    }
                else{
                        flag = true;
                        sum += (count/2)*i;
                        sum += i;
                }
            }
        }
        return sum;
    }
}

//Time Complexity = O(n) + O(range)
//Space Complexity = O(n) for the hashMap.