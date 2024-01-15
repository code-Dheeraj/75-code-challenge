//  Two Sum 

class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> m = new HashMap<>();   // declaring unorder map
       for(int i=0;i<nums.length;i++){             // iterating 
           int dif=target-nums[i];                 //  calculating complement
           if(m.containsKey(dif)){                 //   checking condition if complement is present or not 
               return new int[]{m.get(dif),i};     //  if yes then return an array with indices
           }
           m.put(nums[i],i);                       // if not just put into map 
       }
       return nums;
    }
}
