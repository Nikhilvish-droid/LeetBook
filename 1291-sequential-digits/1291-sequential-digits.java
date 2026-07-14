class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int min_length = String.valueOf(low).length();
        int max_length = String.valueOf(high).length();

        String str = "123456789";
        for(int i = min_length; i <= max_length; i++){

            for(int start = 0; start + i <= 9; start++){
                String substring = str.substring(start, start + i);
                int number = Integer.parseInt(substring);

                if(number >= low && number <= high){
                    ans.add(number);
                }
            }
        }
        return ans;
    
    }
}