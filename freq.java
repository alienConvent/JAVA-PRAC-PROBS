class Solution {
    public int reverse(int x) {
        int dig=0,rev=0,prevRev=0,flag=0;   
        int y=Math.abs(x);
        while(y>0)
        {
            dig=y%10;
            rev=rev*10+dig;
            if((rev-dig)/10 !=prevRev)
            {
                flag=1;
                break;
            }
            prevRev=rev;
            y/=10;
        }
        if(flag==1)
            return 0;
        else if(x<0)
            return (-1*rev);
        else 
            return rev;
    }
}
