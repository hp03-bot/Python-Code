class Solution {
    public int sumCounts(List<Integer> nums) {
        int sum=0;
        int n=nums.size();

        for(int i=0; i<n; i++){
            HashMap<Integer, Integer> map=new HashMap<>();
            for(int j=i; j<n; j++){
                map.put(nums.get(j), map.getOrDefault(nums.get(j), 0)+1);

                int v=map.size();
                sum+=v*v;
            }
        }

        return sum;
    }
}