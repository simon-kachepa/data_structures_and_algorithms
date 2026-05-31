class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> mySet = new HashSet<>();

        for(int i = 0; i < nums.length; i++){
            mySet.add(nums[i]);
        }

        if (nums.length != mySet.size())
            return true;

        return false;
        
    }
}