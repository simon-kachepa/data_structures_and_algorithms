class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int j = nums.length - 1;

        for (int i = 0; i <= j; i++){
            if (nums[i] != val){
                count++;
                continue;
            }
            else{
                while (nums[j] == val && j > i){
                    j--;
                }
                if (nums[j] != val){
                    nums[i] = nums[j];
                    count++;
                    j--;
                }
            }
        } 

        return count;
            
    }
}