class Solution {
    public int commonFactors(int a, int b) {
        int count=0,i=1;
        while(i>0 && i<=1000){
            if(a%i==0 && b%i==0) {
                count++;
                i++;
            }else{
            i++;
            }
        } return count;
    }
}