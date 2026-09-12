class Solution {
    public boolean isAnagram(String s, String t) {
      Map<Character, Integer> firstAnagram = new HashMap<>();
      Map<Character, Integer> secondAnagram = new HashMap<>();
      
       for (char cS : s.toCharArray()){
         int count = firstAnagram.getOrDefault(cS,0);
         firstAnagram.put(cS, count + 1);
       }

        for (char cT : t.toCharArray()){
         int count = secondAnagram.getOrDefault(cT,0);
         secondAnagram.put(cT, count + 1);
       }

       if (firstAnagram.equals(secondAnagram)){
        return true;
       }

       return false;
       
    }
}
