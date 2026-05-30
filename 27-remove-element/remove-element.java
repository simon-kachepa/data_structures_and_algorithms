class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                myList.add(nums[i]);
            }
        }

        for (int i = 0; i < myList.size(); i++){
            nums[i]= myList.get(i);
        }

        return myList.size();
            
    }
}