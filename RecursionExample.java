public class RecursionExample {
    public static void main(String [] args){
        ans(5);

    }
    static void ans(int n){
        // question here is to print the number from n to 1 using recursion 



        // base condition
        if(n<=1){
            System.out.println(1);
            return;
        }
        // this is how it is working 
        //  first of all it is printing the number n before passing the argument to the recursive function , so the pattern goes like this 5,4,3,2,1 and one the stack gets empty , the method has no other command to perform
        
        System.out.println(n);
        ans(n-1);
    }
    
}
