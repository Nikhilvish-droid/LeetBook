class Solution {
    public int maxProduct(int n) {
        if(n/100 == 0){
            int first = n/10;
            int second = n%10;
            System.out.println(first +" "+ second);
            return first*second;
        }
        int first = 0, second = 0;
        int x = n;
        while(x > 0){
            int rem = x%10;
            System.out.println(first +" "+ second+ " " + rem);
            if(first < rem){
                second = first;
                first = rem;;
            }
            else if(first >= rem && rem > second){
                second = rem;
            }

            x /= 10;
        }

        return first*second;
    }
}