class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums){
          if (set.contains(num)){
              return true;
          }
          else {set.add(num);}

        }
        return false;
    }
}

// what needs to be returned? we need to return true or false
// conditions? if (nums. appear >1 return true; )
// did we need to store something? yes. we can store somethign to lower the complexity
// 