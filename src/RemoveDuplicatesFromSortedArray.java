public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int j = 0;
        int l = 0;
        int temp = nums[0];

        for (int i = 0; i < nums.length; i++) {
            nums[k] = temp;
            l++;
            for (j = i + 1; j < nums.length && nums[i] == nums[j]; j++) {
                l++;
            }
            if (j < nums.length) {
                temp = nums[l];
            }
            i = j - 1;
            k++;
        }

        return k;
    }
}
