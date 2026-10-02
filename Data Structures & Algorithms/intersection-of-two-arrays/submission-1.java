class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> setNums1 = new HashSet<>();
        Set<Integer> setNums2 = new HashSet<>();

     for (int i = 0; i < nums1.length; i++){
        if (!setNums1.contains(nums1[i])){
           setNums1.add(nums1[i]);
        }
     }


     for (int j = 0; j < nums2.length ; j++){
       if (setNums1.contains(nums2[j]) && !setNums2.contains(nums2[j])){
           setNums2.add(nums2[j]);
       }

     }
      int index = 0;
      int[] intersected = new int[setNums2.size()];
      for (int num : setNums2){
        intersected[index] = num;
        index++;
      }
     return intersected;
    }
}

// what we need to return? we need to return an array [] return intersected values
// conditions? if (nums1[i].contains[nums2[i]]){nums2.add;}
// 