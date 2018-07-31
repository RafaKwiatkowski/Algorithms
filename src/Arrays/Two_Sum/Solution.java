package Arrays.Two_Sum;


import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer val = map.get(target - nums[i]);
            if (val == null) {
                map.put(nums[i], i);
            } else {
                arr[0] = val;
                arr[1] = i;
            }
        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arguments = {8, 6, 5, 12, 9, 2, 3};
        int target = 10;
        int[] x = Solution.twoSum(arguments, target);
        System.out.println(x[0]);
        System.out.println(x[1]);

    }
}
