import java.util.Arrays;


public class Ceiling {
    public static void main(String[] args){
        // finding the ceiling of the target in the array
        int arr[]={1,2,3,4,5,8,10};
        System.out.println(ceiling(arr, 11));
    }
    


    static int ceiling(int arr[],int target){
        // the basic idea behind ceiling is to find the smallest integer which is greater than or equal to the target value
        // we are going to apply the idea of binary search here , it is similar to the ceiling part , but instead of 3
        // we have 4 possibilites 
        // 1. arr[mid]<target
        // 2. arr[mid]>target
        // 3. arr[mid]==target 
        // the target value's ceiling doesnot exist in the array
        int start=0;
        int end=arr.length-1;
        if(target>arr[end]){ //4th possibility 
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){   //1st possibility
                start=mid+1;
            }
            else if(arr[mid]>target){ //2nd possibility
                end=mid-1;
            }
            else{
                return mid;  //3rd possibility
            }
            // now what is happening here is 
            // suppose we have a number 6
            // we know that 6 is between 5 and 8 
            // start  middle    end
            // 5       5         8
            // arr[mid]<target
            // start=mid+1
            // start middle and end =8
            // arr[mid]>target
            // end=mid-1
            // start  middle   end 
            //  8       8       5
            // so start becomes the smallest integer bigger to the target
            
        
    }
    return start;
    }
}
