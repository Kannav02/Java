public class FindTheSingleNumber {
    public static void main(String[] args){
        // we know that the XOR operator when used with the same number gives us 0 as the output 
        // one more thing when we use XOR operator, the order doesnot matters , it is just like multiplying , the order does not matter
        // suppose the array is [1,2,2,1,3] , here the XOR operator will be used and the duplicate values itself will give zeroes and the non-duplicate value will be returned
        int []arr={1,1,2,2,5,3,3};
        System.out.print(ans(arr));
    }
    static int ans(int[]arr){
        // this ans var will be used to XOR through the array
        // here ans =1 because when any number is XOR'ed with 0 , it gives the number itself
        int ans=0;
        for(int i =0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;

    }
    
}
