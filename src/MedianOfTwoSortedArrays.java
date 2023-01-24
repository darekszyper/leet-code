//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArrays = mergedArrays(nums1, nums2);

        if (mergedArrays.length % 2 == 0) {
            return (mergedArrays[(mergedArrays.length / 2) - 1] + mergedArrays[mergedArrays.length / 2]) / 2.0;
        } else {
            return mergedArrays[mergedArrays.length / 2];
        }
    }

    public static int[] mergedArrays(int[] nums1, int[] nums2) {
        int[] mergedArrays = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArrays[k] = nums1[i];
                i++;
            } else {
                mergedArrays[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            mergedArrays[k] = nums1[i];
            k++;
            i++;
        }

        while (j < nums2.length) {
            mergedArrays[k] = nums2[j];
            k++;
            j++;
        }

        return mergedArrays;
    }


}
