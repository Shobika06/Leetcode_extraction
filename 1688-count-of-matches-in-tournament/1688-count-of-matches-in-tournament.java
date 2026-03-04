class Solution {
    public int numberOfMatches(int n) {
        int match;int count=0;
        while(n!=1){
        if(n%2==0) { 
            match=n/2; 
            count=count+match;
            n=match;
           
        }
        else{ 
            match=(n-1)/2;
            count=count+match;
             n=match+1;
          
             }
        }
        return count;
    }
}