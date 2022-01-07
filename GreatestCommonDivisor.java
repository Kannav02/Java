public class GreatestCommonDivisor {
    public static void main(String []args){
        System.out.println(ans(105,224));

    }
    static int ans(int a,int b){
        if(a==0){
            return b;
        }
        return ans((b%a),a);
    }
    
}
