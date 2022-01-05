public class NumberOfZeroesRecursive {
    public static void main(String [] args){
        System.out.println(ans(200000));

    }
    static int ans(int n){
        // this is just a basic question wherein we need to count the number of zeroes in a given number 
        // we will again be using a helper function , this is just a normal function which we use to avoid unneccesaary paramters
        return helper(n,0);
    }
    static int helper(int n,int count){
        // this is the recursive function



        // this is the base condition 
        if(n==0){
            return count;
        }
        // this is one of the conditions for the recursive function 
        // this takes into account the number and the counter
        // if the number modulu 10 ==0, then we can add 1 to the counter
        // otherwise just divide the number by 10 and move on with the same counter
        if(n%10==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
    
}
