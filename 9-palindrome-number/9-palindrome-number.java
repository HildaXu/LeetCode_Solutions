class Solution {
     public boolean isPalindrome(int x) {
		// negative case
        if(x < 0 || (x!=0 && x%10 == 0)) return false;
        int res = 0;
		// idea here is to recontruct the given input from reverse and later check whether 
		// the input and the result match
        while(res < x) {
            res = res*10 + x%10;
            x = x/10;
        }
        
        return (x==res || res/10 == x);
    }

}


