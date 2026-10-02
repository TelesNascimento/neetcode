class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> seenNums1 = new HashSet<>();
       Set<Integer> seenNums2 = new HashSet<>();


      for (int i = 0; i < nums1.length; i++){
         if (!seenNums1.contains(nums1[i])){
            seenNums1.add(nums1[i]);
         }
      }
     

      for (int j = 0; j < nums2.length; j++){
         if (seenNums1.contains(nums2[j])){
             seenNums2.add(nums2[j]);
         }
      }
      
      int[] intersected = new int[seenNums2.size()];
      int index = 0;
      for (int num : seenNums2){
           intersected[index] = num;
           index++;
      }
      
      return intersected;
    }
}

// What needs to return? given two integeer arrays nums1 and nums2, 
// we must return and array of their intersection. each elemnt in the result must be unique and you may return the reuslt u unyh a y onrderl. 
// we must get the number of array 1 and array 2, and see the numbers that has yn both sections.
// how do we get that? get the values of array 1, and look at array 2, if has any of these numbers, and return the int = these two numbers of intersection
// what needs to be return int[] 
// how is supposed to do that? if (nums1[i].equals(nums2[i])){
            // ?? first idea. 
//}what needs to happen before? we must get the comparation of both arrays, or
// do i need to store something? yes, you need to store the numbers that has both on the first aray and the second one 
// how to i get these? i need to scan both of the arrays. and compare the numbers of the arrays. 
// fix the value at first scan, the nums1[0]. = 2 the second scan if (num1[0] == num2[0]) int [i] double scan? O(nˆ2); but its the best solution i have now. and will work 
// how to make this o(1)?  what variable cani reuse. 

//1 set, no primeiro for, eu guardo os valores ems et. de nums1. ou seja umunico valor. 
//no segundo for, eu ja percorro o valor verificando se comtem no 1 set. se contem, adiciona no array new int[i]dois sets. o primeiro set, guarda sos valores ja verificados ali do priemiro o sgundo set, vai ser adicionado. !seennums2.contains(nums2(i)){int[]{} = }