class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> has =new HashMap<>();
        int si=nums.length;
        for(int i=0;i<si;i++){
            int diff=target-nums[i];
            if(has.containsKey(diff)){
                return new int[]{i,has.get(diff)};
            }
            has.put(nums[i],i);
        }
        return null;
    }
}