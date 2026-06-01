class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> myList = new ArrayList<>();
        double median;

        for (int i = 0; i < nums1.length; i++){
            myList.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++){
            myList.add(nums2[i]);
        }

        Collections.sort(myList);

        int listSize = myList.size();

        if(listSize % 2 == 1){
            return myList.get(listSize/2);
        }
        else{
            double midLeftElement = myList.get((myList.size()/2) - 1);
            double midRightElement = myList.get(myList.size() / 2);
            median = (midLeftElement + midRightElement) / 2;
            return  median;
        }
    }
}