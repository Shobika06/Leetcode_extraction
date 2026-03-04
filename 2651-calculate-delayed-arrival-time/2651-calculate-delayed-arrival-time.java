class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       int n=arrivalTime+delayedTime;
       if(n==24) return 0;

       else return n%24; 
    }
}