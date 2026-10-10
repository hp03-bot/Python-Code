class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        long k =(long)k1+k2;
        int arr[]=new int[n];
        int maxi = 0;
        long total=0;
        for(int i=0;i<n;i++)
            {
                arr[i]=Math.abs(nums1[i]-nums2[i]);
                maxi = Math.max(maxi,arr[i]);
                total+=arr[i];
            }
        if(total <= k)return 0;
        long cnt[]=new long[maxi+1];
        for(int i=0;i<n;i++)
        {
             cnt[arr[i]]++;
        }
        for(int i=maxi;i>0 && k>0;i--)
        {
            if(cnt[i]==0)continue;

            if(k>=cnt[i])
            {
                k-=cnt[i];
                cnt[i-1]+=cnt[i];
                cnt[i]=0;
            }
            else
            {
                cnt[i]-=k;
                cnt[i-1]+=k;
                k=0;
            }
        }
        long ans=0;
        for(int i=0;i<=maxi;i++)
        {
            ans+= cnt[i]*(long)i*i;
        }
        return ans;
    }
}