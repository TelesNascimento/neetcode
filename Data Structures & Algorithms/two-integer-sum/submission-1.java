class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] summedIndices = new int[2];
        

for (int i=0; i < nums.length; i++){
   for (int j=0; j < nums.length; j++){
     if (i != j && nums[i] + nums[j] == target){
         summedIndices[0] = i; 
         summedIndices[1] = j;
      }
    }
}
    Arrays.sort(summedIndices);
    return summedIndices;
    }
}

// 1. What we want to return? return the indices I and J, such the sum os the values, equals target and i is diferente from j.return summedIndices; int[] summedIndices = new int[2];
// 2. What is the condition?  i must be different of j, i !=j, and the sum of nums[i] and nums[j] = target. small index must be first. so if (i != j && nums[i] + nums[j] == target); 
// 3. Do we need to get any value to be preserved between the conditions?  do we need to get the value to be accumulated? no, we dont, 
// 4. How we are going to make that? We need to make a scan, (run through all the index) at the J indice scan, we must get the statemente of the condition. 
// 5. Annotations. lets fix the index. If i == 0, j must be != 0. 
// How to optimize it? 