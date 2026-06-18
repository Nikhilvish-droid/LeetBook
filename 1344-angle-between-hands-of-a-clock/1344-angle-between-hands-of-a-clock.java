class Solution {
    public double angleClock(int hour, int minutes) {
        double hourdegre = 30*hour + 0.5*minutes;
        double minutedegre = 6*minutes;

        double ans = Math.abs(hourdegre - minutedegre);
        ans = Math.min(360 - ans, ans);
        return ans;
    }
}