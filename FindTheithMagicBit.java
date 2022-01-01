public class FindTheithMagicBit {
    public static void main(String[] args){
        System.out.println(MagicNumber(5));

    }
    static int MagicNumber(int n){
        // First of all magic number is that number whose binary form is multiplied with the power of 5 responding to the index number of binary number
        // suppose 4 ==101
        // ans 1*5^2 +0+1*5^0
        int ans=0;
        int base=5;
        while(n>0){
            if((n&1)==1){
                ans+=base;
            }
            base=base*5;
            n=n>>1;
        }
        return ans;
    }
    
}
