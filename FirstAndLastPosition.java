import java.util.Arrays;





public class FirstAndLastPosition{
    public static void main(String[] args){
        // 
    }
    static int[] searchRange(int arr[], int target){
        int[] ans={-1,-1};
        int start=-1;
        int end =-1;
        start=search(arr,target,true);
        if(start!= -1){
            end=search(arr, target, false);

        }
        ans[0]=start;
        ans[1]=end;
        return ans;
    }


    // the question here is to find the index of first and last position of a target element in the array 
    // for example {1,2,3,4,4,4,4,5,6} here the target element is 4 , so the first and last position of it 
    // would be [3,6]
    // so the approach that we are going to use here is we are going to apply binary search to find out the first index i.e on the left side and then find  out the last 
    // index that is on the right side

    static int search(int arr[],int target,boolean FindFirst){
        int start=0;
        int end =arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){   //1st possibility
                start=mid+1;
            }
            else if(arr[mid]>target){ //2nd possibility
                end=mid-1;
            }
            else{
                ans=mid;
                if(FindFirst){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                } 
            }

    }
    return ans;
}







}