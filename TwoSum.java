import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value → index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // what we need
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // found the pair
            }
            map.put(nums[i], i); // store current number and index
        }
        return new int[] {}; // no solution found
    }
}
