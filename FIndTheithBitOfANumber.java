public class FIndTheithBitOfANumber {
    public static void main(String[]args){
    System.out.println(Integer.toBinaryString(45));
    System.out.print(Integer.toBinaryString(find(45,3)));
}
    static int find(int n,int i){
        return((n&(1<<i-1)));
        }
    }
    

