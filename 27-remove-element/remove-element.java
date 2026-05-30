class Solution {
    public int removeElement(int[] nums, int val) {
        int [] arraySub = new int[nums.length];
        int count = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                arraySub[j] = nums[i];
                count++;
                j++;
            }
        }

        for (int i = 0; i < count; i++){
            nums[i]= arraySub[i];
        }

        return count;
            
    }
}