class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i< numRows; i++){
            ans.add(new ArrayList<>());
            int k = 0;
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    ans.get(i).add(1);
                }
                else{
                    int val = ans.get(i-1).get(k) + ans.get(i-1).get(k+1);
                    ans.get(i).add(val);
                    k++;
                }
            }
        }
        return ans;
    }
}