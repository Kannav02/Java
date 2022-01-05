public class PowerUsingBitwiseOp{
    public static void main(String [] args){
        System.out.println(ans(2,6));

    }
    static int ans(int a,int b){
        // time complexity here is equal to the number of time the loop runs , that is the number of digits in the power , which is O(log(b))
        int ans=1;
        int base =a;
        while(b>0){
        if((b&1)==1){
            ans*=base;
        }
        base*=base;
        b=b>>1;

        }
        return ans;
    }
}