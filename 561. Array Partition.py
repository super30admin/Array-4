class Solution:
    def arrayPairSum(self, nums: List[int]) -> int:


    # # Time: O(n logn) for sorting and then iterating give O(n) but nlogn precedes
    # # Space: O(1)
    #     # First sort the array
    #     nums.sort()
    #     # then see each two elements as a pair
    #     result = 0
    #     # So while choosing the min element would always be at odd index so add that to result
    #     for i in range(0,len(nums),2):
    #         result += nums[i]

    #     return result



        # HASH MAP SOLUTION 
        # Time: max(range,n)
        # Space: O(n)

        my_dict = {}
        min_val, max_val = 0, 0
        # Make a hash map and put all the elements in the array in that hashmap with the number of occurances that they have
        for i in range(len(nums)):
            min_val = min(nums[i], min_val)
            max_val = max(nums[i], max_val)
            if nums[i] in my_dict:
                my_dict[nums[i]] += 1
            else:
                my_dict[nums[i]] = 1
        # Initialise a result and a flag which if True skip the element
        result = 0
        flag = False
        # Loop from the min_val to the max_val
        for i in range(min_val, max_val + 1):
            # If i is not there in hash map do nothing
            if i not in my_dict:
                continue
            # Get the current count of a number
            curr_count = my_dict[i]
            while curr_count > 0:
                if not flag:
                    # when current count is greater than 0 and flag is False then add it to result
                    result += i
                # Reverse whatever the flag currently is
                flag = not flag
                # Decreace the counter as it is used
                curr_count -= 1
            # delete the element if it's 0
            my_dict.pop(i, None)
        return result