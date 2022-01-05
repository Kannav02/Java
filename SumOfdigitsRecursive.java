public class SumOfdigitsRecursive {
    public static void main(String[]args){
        System.out.println(ans1(2222));

    }
    static int ans(int n){
        // suppose the number is 1234, we want the answer to be 1+2+3+4
        // reccurence relation is f(n)=n%10=f(n/10)
        if(n%10==n){
            return n;

        }
        return n%10 + ans(n/10);
    }
    static int ans1(int n ){
        // here it is the same as the one for adding 
        // but here the recurrence relation is f(n)=n%10*f(n/10)
        if(n%10==n){
            return n;

        }
        return n%10 * ans1(n/10);

    }
}
