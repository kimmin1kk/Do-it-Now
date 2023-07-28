import java.util.*;
class Solution {
    public String solution(String s) {
        String[] numStr = s.split(" ");
        int[] nums = new int[numStr.length];
        for(int i = 0; i < nums.length; i++){
            nums[i] = Integer.parseInt(numStr[i]);
        }

        Arrays.sort(nums);

        return nums[0] + " " + nums[nums.length-1];
    }
}