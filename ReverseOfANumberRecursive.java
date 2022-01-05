public class ReverseOfANumberRecursive{
    static int sum=0;
    static void ans(int n){
        // if we are given a number 1234 , we need to display 4321
        // bruteforce solution for this is first taking out the last digit and adding it to a sum*10,initially the sum would be 0 . now after doing this we need to do n/10
        // There are 2 ways to solve this question using recursion


        // first one being this,here we are simply converting the bruteforce solution to a recursive solution , the idea here is the same
        if(n==0){
            return;


        }
    
        int rem=n%10;
        sum=sum*10+rem;
        ans(n/10);

    }
    static int ans2(int n){
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
    
    public static void main(String []args){
        System.out.println(ans2(1234));

    }
}