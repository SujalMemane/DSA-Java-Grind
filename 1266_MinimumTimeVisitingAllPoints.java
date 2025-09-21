class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points == null || points.length <= 1) return 0;

        int distance = 0 ;
        
        for( int i = 1 ; i< points.length ; i++){
            int dx = Math.abs( points[i][0] - points[i-1][0]);
            int dy = Math.abs( points[i][1] - points[i-1][1]);

            distance += Math.max(dx , dy);
        }
        return distance;
    }
}