

class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */

/*    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 5;
        System.out.println(Arrays.callBinarySearch(nums, key));
    }*/
    public static int callBinarySearch(int[] nums, int key) {


       return java.util.Arrays.binarySearch(nums, key);
    }
}