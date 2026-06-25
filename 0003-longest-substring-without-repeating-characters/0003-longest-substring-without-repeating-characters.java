class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> map = new HashSet<>();
        int maxlength = 0;
        int left = 0;
        for(int i = 0; i < n; i++){
            while(map.contains(s.charAt(i))){
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(i));
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
    }
}