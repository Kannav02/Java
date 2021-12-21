import java.util.Arrays;




public class FindElementInAnInfinitArray {
    public static void main(String[] args){
        // find an element in an infinte array , basically meaning we have no end and start bounds in the array
        int [] arr={1,2,3,4,5,6,7,9,10,11,12,13,14};
        System.out.println(search(arr,0));


    }
    

    

    static int search(int[]arr, int target){
    int start=0;
    int end=1;
    while(target>arr[end]){
        int temp=end+1;
        end=end+(end-start+1)*2;
        start=temp;
        // if(end>arr.length-1){
        //     end=arr.length-1;    
        //     break;
        // these lines are just to test if this performs the function as a normal binary search would do
            
        }
    return FindElement(arr,target,start,end);
    }
    static int FindElement(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){   //1st possibility
                start=mid+1;
            }
            else if(arr[mid]>target){ //2nd possibility
                end=mid-1;
            }
            else{
                return mid; //3rd Possibility
            }
        }
        return -1;
    }
}
