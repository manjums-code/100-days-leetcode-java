class Plusone {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
     if(digits[n-1]+1 < 10)
    {
        digits[n-1]++;
        return digits;
    }
    else
    {   digits[n-1]=0;
        int rem=1;
        for(int i=n-2;i>=0;i--)
        {
            if(digits[i]+rem==10)
            {
                digits[i]=0;
            }
            else
            {   rem=0;
                digits[i]++;
                return digits;
            }
        }
        if(rem==1)
        {
            int []res=new int[n+1];
            res[0]=1;
            return res;
        }
    }
    return digits;
    }
}