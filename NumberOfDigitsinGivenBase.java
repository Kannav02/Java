public class NumberOfDigitsinGivenBase {
    public static void main(String [] args){
        System.out.println(NumberDigits(17,2));

    }
    static int NumberDigits(int a ,int b){
        // here int a is the number, int b is the base to which you want to find the digits
        int ans=(int)(Math.log(a)/Math.log(b))+1;
        return ans;
      

    }
    
}
