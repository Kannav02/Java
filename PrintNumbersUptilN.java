public class PrintNumbersUptilN {
    public static void main(String []args){
        // print numbers from 1 uptill n 
        ans(10);
    }
    static void ans(int n){
        if(n<=1){
            System.out.println(1);
            return;
        }

        // how this works is that we know that each and every recusrive function after exiting the stack performs that command it is given after , and hence this is how it works
        
        ans(n-1);
        System.out.println(n);
    }
    
}
