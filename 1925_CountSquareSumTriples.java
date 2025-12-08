class Solution {
    public int countTriples(int n) {
        int count = 0; 

        for( int i =  1 ; i <  n + 1 ; i++){
            for( int j = 1 ; j < n + 1 ; j++){
                int sum =  i * i + j * j ;

                int c = (int)Math.sqrt(sum);

                if( c * c == sum && c <= n ){
                    count++;
                }
            }
        }
        return count;
    }
}