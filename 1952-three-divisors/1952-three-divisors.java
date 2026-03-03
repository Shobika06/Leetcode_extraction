class Solution {
    public boolean isThree(int n) {
        int count=0,i=1;
        while(i>0 &&i<=10000){
        if(n%i==0){
            count++;
        }
            i++;
     }
     if(count==3) return true;
     else return false;
    }
}