public class BinaryWayToFindOddOrEven {
    public static void main(String[] args){
        // 2==10
        // 3==11
        //4==100
        //5==101
        //6==110
        //7=111
        // here we find one thing that at the LSB digit , we see that if LSB==1 then the number is odd , otherwise the number is even
        System.out.print(isOdd(6));
    }
    static boolean isOdd(int n){
        if((n&1)==1){
            return true;
        }
        return false;
    }
    
}
