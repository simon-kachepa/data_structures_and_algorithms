class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> uniqueNumbers = new TreeSet<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            uniqueNumbers.add(nums[i]);
        }

        for (Integer num: uniqueNumbers){
            nums[index] = num;
            index++;
        }

        return uniqueNumbers.size();
        
    }
}