import java.util.Arrays;


public class Floor{
    public static void main(String[] args){
        // finding the greatest integer that is lesser than or equal to the number
        int[] arr ={1,2,3,4,5,6,7,8,10};
        System.out.println(floor(arr,0)); 


    }
    static int floor(int []arr,int target ){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
            // here in the end what happens if the element is 9 and it lies between 8 and 10
            // so here we actually donot have an element which is 9 , so instead what happes here is 
            // start    middle     end
            //  8         8         10
            // here the target is more than the middle value so 
            // start end and middle ==10
            // but again we find that the target is less than the middle value so
            // end becomes middle -1 which means , the end value that we have found is the floor value for the given integer

            
        }
        return end;


    }
}
