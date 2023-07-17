class Solution {
public int reverse(int x) {
    
    int rem = 0;
    long reverse = 0;

    
        
    while(x != 0) {
        rem = x%10;
        x = x/10;
        reverse  = reverse*10 + rem;
    }
    
    if(reverse > Math.pow(2, 31)-1 || reverse < -(Math.pow(2, 31))) {
        return 0;
    }

    
int check=(int) reverse;

      return check;
}
}

