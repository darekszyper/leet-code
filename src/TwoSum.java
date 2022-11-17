import java.util.Arrays;
import java.util.stream.Collectors;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = {3,2,4};
        int[] test = {Arrays.stream(array).boxed().toList().indexOf(15), Arrays.stream(array).boxed().toList().indexOf(7)};

        System.out.println(test[0]);
        System.out.println(test[1]);
        System.out.println("Result:");
        System.out.println(Arrays.toString(twoSum(array, 6)));

    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //return new int[]{Arrays.stream(nums).boxed().toList().indexOf(nums[i]), Arrays.stream(nums).boxed().toList().indexOf(j)};
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}

