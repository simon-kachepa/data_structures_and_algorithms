class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            myList.add(nums[i]);
        }

        myList.removeIf(n -> n == val);

        for (int i = 0; i < myList.size(); i++){
            nums[i]= myList.get(i);
        }

        return myList.size();
            
    }
}