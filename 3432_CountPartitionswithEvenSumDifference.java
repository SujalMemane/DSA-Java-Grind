class Solution {
    public int countPartitions(int[] nums) {
        int partitions = 0;

        for( int i = 1 ; i < nums.length ; i++){
            int leftSum = 0 ;
            int rightSum = 0 ;

            for( int j = 0 ;  j < i  ; j++ ){
                leftSum += nums[j];
            }

            for( int j = i ;  j < nums.length  ; j++ ){
                rightSum += nums[j];
            }

            if( (leftSum + rightSum ) % 2 == 0 ){
                partitions++;
            }
        }
        return partitions ;
    }
}

/*Let
leftSum = x
rightSum = y
Total sum = S = x + y
You need (x − y) to be even.
✔ When is (x − y) even?

Because:
x − y = x − (S − x) = 2x − S
2x is always even → so (2x − S) is even iff S is even.

👉 So the entire answer depends only on the total sum S:
If S is even, then all partitions (n − 1) are valid.
If S is odd, then 0 partitions are valid. */

class Solution {
    public int countPartitions(int[] nums) {
        int total = 0 ;

        for( int i : nums) total += i ;

        return (total % 2 == 0) ? nums.length - 1 : 0 ;
    }
}