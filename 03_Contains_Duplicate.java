class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                return true;
            }
            m.put(nums[i],i);
        }
        return false;
    }
}
