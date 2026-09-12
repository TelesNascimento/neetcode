class Solution {
    public boolean hasDuplicate(int[] nums) {
         Set<Integer> isThisDuplicated = new HashSet<Integer>();
   
         for (int num : nums){
           if (isThisDuplicated.contains(num)){
            return true;
           }
              isThisDuplicated.add(num);

         }
         return false;
    }
}