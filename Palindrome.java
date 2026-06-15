class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        else{
            int temp=x;
            int revOfx=0;
            while(x!=0)
            {
              revOfx*=10;
              revOfx +=x%10;
              x/=10;
            }            
            return (temp==revOfx);
        }
    }
}
