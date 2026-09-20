class Solution {
    public int reverseDegree(String s) {
        int total=0;
        int n=s.length();
        for(int i=0;i<n;i++){
           int pro=0;
            char ch=s.charAt(i);
            pro= (26-(ch -'a'));
            total+=pro*(i+1);
        }
        return total;
    }
}