class Solution {
    public String intToRoman(int num) {
        String ans = "";

        while(num >= 1000){
            if(num - 1000 >= 0){
                num -= 1000;
                ans += "M";
            }
        }


        while(num >= 500){
            if(num >= 900 && num < 1000){
                num -= 900;
                ans += "CM";
            }

            if(num - 500 >= 0){
                num -= 500;
                ans += "D";
            }
        }

        while(num >= 100){

            if(num >= 400 && num <500){
                num -= 400;
                ans += "CD";
            }
            if(num - 100 >= 0){
                num -= 100;
                ans += "C";
            }
        }

        while(num >= 50){
            if(num >= 90 && num < 100){
                num -=90;
                ans +="XC";
            }

            if(num - 50 >= 0){
                num -= 50;
                ans += "L";
            }
        }

        while(num >= 10){
            if(num >= 40 && num < 50){
                num -= 40;
                ans += "XL";
            }

            if(num - 10 >= 0){
                num -= 10;
                ans += "X";
            }
        }

        while(num >= 5){
            if(num == 9){
                num -= 9;
                ans += "IX";
            }
            if(num - 5 >= 0){
                num -= 5;
                ans += "V";
            }
        }

        while(num > 0){
            if(num == 4){
                num -= 4;
                ans += "IV";
            }

            if(num - 1 >= 0){
                num -= 1;
                ans += "I";
            }
        }

        return ans;
    }
}