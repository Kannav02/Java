public class ResetTheithbit {
    public static void main(String[]args){
        System.out.println(Integer.toBinaryString(reset(45,5)));

    }
    static int reset(int n,int i){
        return(n|(1<<i-1));

    }
}
