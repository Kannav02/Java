public class TheRightMostSetBit {
    public static void main(String [] args){
        System.out.println(ans(292));

    }
    static int ans(int n){
        // suppose the binary number is 100100100 which in decimal is 292
        // here the solution would be dividing the binary numebr in 2 parts
        // 100100100
        // -a----1-b-
        // here part a is the part which is irrelevant to us , so we want to convert it to a bunch of zeroes
        // and the part 1-b is our answer
        // so the bruteforce solution would be to find a number that is ~a1b , & this with the original a1b , this will give us a bunch of 
        // zereos in the place of a , and the b part will remain the same and the 1 part will remain the same
        // the number ~a1b is actually the negative of the number , so the answer would be (N&-N), which would return the ans that we want
        return (n&-n);
    }
    
}
