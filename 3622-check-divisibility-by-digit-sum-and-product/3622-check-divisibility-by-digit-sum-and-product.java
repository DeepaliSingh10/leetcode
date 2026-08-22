class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int product=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            product*=d;
            n/=10;
        }
        int ans=product+sum;
        if(temp%ans==0)
        return true;
        else return false;
    }
}