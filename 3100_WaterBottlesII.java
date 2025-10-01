class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange){

        int total = numBottles;
        int empty = numBottles;

        while(empty >= numExchange){
            total -= numExchange;
            total += 1;
            empty += 1;
            numExchange++;
        }
        return total;
    }
}