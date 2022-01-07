public class SieveOfErastothenes {
    public static void main(String [] args){
        boolean[] primes=new boolean[41];
        ans(41,primes);

    }
    static void ans(int n , boolean [] primes){
        

        for(int i=2;i*i<n;i++){
            if(!primes[i]){
                for(int j=i*2;j<=n;j+=i){
                    primes[j]=true;
                }


            }
        }
        for(int i=2;i<n;i++){
            if(!primes[i]){
                System.out.print(i+" ");
            }
        }
    }
    
}
