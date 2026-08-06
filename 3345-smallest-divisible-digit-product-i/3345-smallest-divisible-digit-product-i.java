class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n;
        //int p=pro(n);
        while(temp!=0){
            int p=pro(temp);
            if(p%t==0)
            break;
            else 
            temp++;
        }
        return temp++;
    }
    int pro(int n){
        int pro=1;
        while(n!=0){
            pro*=n%10;
            n/=10;
        }
        return pro;
    }
}