class Solution {
    public int largestAltitude(int[] gain) {
        int maxele = Math.max(0, gain[0]);
        
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i] + gain[i-1];
            maxele = Math.max(gain[i], maxele);
        }
        return maxele; 
    }
}