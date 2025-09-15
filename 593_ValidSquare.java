class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<Integer> dists = new ArrayList<>();
        dists.add(distSqr(p1, p2));
        dists.add(distSqr(p1, p3));
        dists.add(distSqr(p1, p4));
        dists.add(distSqr(p2, p3));
        dists.add(distSqr(p2, p4));
        dists.add(distSqr(p3, p4));


        Collections.sort(dists);

        boolean sideEql = dists.get(0).equals(dists.get(1)) &&
                          dists.get(1).equals(dists.get(2)) &&
                          dists.get(2).equals(dists.get(3)) &&
                          dists.get(0) != 0 ;

        boolean diagonalEql = dists.get(4).equals(dists.get(5));

        return sideEql && diagonalEql ;
    }
    public int distSqr( int[] a , int[] b){
        int dx = a[0] - b[0];
        int dy = a[1] - b[1];
        return  dx*dx + dy*dy;
    }
}