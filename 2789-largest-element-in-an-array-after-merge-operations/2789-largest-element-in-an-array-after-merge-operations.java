class Solution {
    public long maxArrayValue(int[] nums) {
        long[] copy = new long[nums.length];
        for (int i=0; i<nums.length; i++) {
            copy[i]=nums[i];
        }
        for (int i=copy.length-1; i>0; i--) {
            if (copy[i]>=copy[i-1]) {
                copy[i-1]+=copy[i];
            }
        }
        return copy[0];
    }
}