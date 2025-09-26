class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int dis=0;
        int total=0;
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        for(int i=0; i<distance.length; i++){
            if(start<=i && i<destination){
               dis+=distance[i];
            }
            total+=distance[i];
        }
        return Math.min(dis, total-dis);
    }
}
