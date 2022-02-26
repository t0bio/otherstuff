import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i ++){
            int diff = target - nums[i];
            if(!map.containsKey(nums[i])){
                map.put(diff,i);
            }
            else{
                sol[0] = map.get(nums[i]);
                sol[1] = i;
            }
        }
        return sol;
    }
}