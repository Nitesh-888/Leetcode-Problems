class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int ans=0;
        int currAlt=0;
        for(int i=0; i<n; i++){
            currAlt+=gain[i];
            ans=Math.max(ans, currAlt);
        }
        return ans;
    }
}