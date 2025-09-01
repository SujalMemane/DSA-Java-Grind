//solution one for loop 
class Solution {
    public int differenceOfSums(int n, int m) {
        int sum1 =0 , sum2= 0;
        
        for( int i = 1 ; i <= n ; i++){
            if( i % m != 0 ){
                sum1 += i;
            }else{
                sum2 +=  i;
            }
        }
        return sum1 - sum2;
    }
}

//better and faster 
//using total sum formula 
class Solution {
    public int differenceOfSums(int n, int m) {
        
        int totalSum = (n * (n +1 )) / 2 ;
        int divisible = n / m ; 
        int divSum = m*((divisible * (divisible +1 )) / 2 );
        int nondivSum = totalSum - divSum ;

        return nondivSum - divSum ;
    }
}