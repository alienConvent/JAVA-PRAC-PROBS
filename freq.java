class Solution {
    public int reverse(int x) {
        int dig=0,rev=0,prevRev=0,flag=0;   
        int y=Math.abs(x);
        
        if(flag==1)
            return 0;
        else if(x<0)
            return (-1*rev);
        else 
            return rev;
    }
}
