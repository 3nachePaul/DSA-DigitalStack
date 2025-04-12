package _01_Java_Basics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(nums[0], 0);

        for (int i = 1; i <= nums.length - 1; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {2, 15, 8, 1, 5};
        System.out.println(Arrays.toString(twoSum(nums, 20)));
    }
}
