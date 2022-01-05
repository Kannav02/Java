public class PalindromeRecursive {
    public static void main(String[]args){
        System.out.println(IsPalindrome(121));

    }
    static boolean IsPalindrome(int n ){
        return (n==ans(n));
    }
    static int ans(int n){
        // this is the other method , which will utilise the  helper function 
        int digits =(int)(Math.log10(n)+1); //this is the total number of digits in a number
        return helper(n,digits);


    }
    static int helper(int n,int digits){
        // here what we will do is multiply the number that we are getting after modulo with 10 raised to the power of digits-1 and add it to our sum variable
        if(n%10==n){
            return n;
        }
        return n%10*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);

    }

    
}
