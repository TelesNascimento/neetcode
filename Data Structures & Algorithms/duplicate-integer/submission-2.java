class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(); // 2. step.

      for (int num : nums){
      if (seen.contains(num)){  // condition 3.step
          return true; 
      }
     else{ // condition 4. step
          seen.add(num);
     }
}
        return false;// 1. step
    }
}


// oQUE PRECISA RETORNAR? True ou false if has any duplciate return true or false we get an input of array nums and must return true if any value appears more than once in the array;
// What needs to happen before? we need to check the condition
// What condition? if (number appear > 1 return true;)else {false};
// What mechanism can i use to get this condition easy? we need to make a way that if the value appears twice is returns true;
// what posibilities? a set is the perfect mechanism
// Do i need to store anything? no
// how is supposed to get from a array the number, i need to scan this. 
