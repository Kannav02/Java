public class SquareRoot {
    public static void main(String []args){
        System.out.println(ans(36));

    }
    static int ans(int n){
        int start=0;
        int end=n;
        while(start<=end){
        long  mid=start+(end-start)/2;
        if(mid*mid==n){
            return (int)mid;
        }
        else if(mid*mid>n){
            end=(int)mid-1;
        }
        else{
            start=(int)mid+1;
            
        }
    }
    return end;

    }
    
}
