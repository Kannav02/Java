public class PowerOfTwo {
    public static void main(String [] args){
        System.out.println(ans(64));

    }
    static boolean ans(int n){
        // here we want to know whether a number is a power of 2 or not 
        // the basic logic that goes here is that for a number to be solely a power of 2 , it must have only 1 binary number which has values has 1
        // rest all the numbers must be 0
        // so the bruteforce solution that can be used here is that keep a counter for the number of 1's in the binary form of the number and then if the counter
        // exceeds 1 we can say that the number is not a power of 2 
        // this is a bruteforce solution, its time complexity is O(N)
        // for an optimised solution , we can see that for a number to be a power of 2 , lets assume the number is 10000 , which is 16 
        // and if a number is not a power of 2 , lets assume it is 20 which is 10100
        //  if we and this number with its predecessor that is n-1 , we must get 0 if it is a power of 2 , otherwise we will get 1 
        // so this is the answer in 0(1) time complexity 
        if(n==0){
            return false;
        }
        return ((n&(n-1))==0);
        
    }
    
}
