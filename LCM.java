public class LCM {
    public static void main(String[]args){
        System.out.println(LCM(3,7));

    }
    static int LCM(int a ,int b){
        return a*b/gcd(a,b);
    }
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd((b%a),a);
    }
    
}
