class Solution {

  List < List < Integer >> res = new ArrayList < > ();

  HashSet < String > dups = new HashSet < > ();

  public void nextPermutation(int[] nums) {

    // find all permutations
    helper(nums, 0, new ArrayList < > (), new HashSet < > ());

    // sort permutations in lexicographical order
    res = res.stream().sorted((o1, o2) -> {
      for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
        int c = o1.get(i).compareTo(o2.get(i));
        if (c != 0) {
          return c;
        }
      }
      return Integer.compare(o1.size(), o2.size());

    }).collect(Collectors.toList());

    int itr = 0;

    // find the permutation which is equal to nums

    for (int i = 0; i < res.size(); i++) {
      List < Integer > curr = res.get(i);
      int[] currarr = curr.stream()
        .mapToInt(Integer::intValue)
        .toArray();

      if (equal(currarr, nums)) {
        // if next permuations exist return that
        if (i + 1 < res.size()) {

          for (int j: res.get(i + 1)) {
            nums[itr++] = j;
          }

          return;
        }
      }
    }

    for (int j: res.get(0)) {
      nums[itr++] = j;
    }

    return;

  }

  // to find all permutations
  private void helper(int[] nums, int index, List < Integer > temp, HashSet < Integer > set) {
    if (index == nums.length) {

      String s = "";

      for (int i: temp) {
        s += String.valueOf(i);
      }

      if (!dups.contains(s)) {
        res.add(new ArrayList < > (temp));
        dups.add(s);

      }

      return;

    }

    for (int i = 0; i < nums.length; i++) {
      if (!set.contains(i)) {
        temp.add(nums[i]);
        set.add(i);
        helper(nums, index + 1, temp, set);
        temp.remove(temp.size() - 1);
        set.remove(i);
      }

    }

  }

  // check if 2 arrays are equal
  private boolean equal(int[] arr1, int[] arr2) {
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] != arr2[i]) return false;
    }

    return true;
  }
}
