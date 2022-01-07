public class RotatedBinarySearchRecursion {
    public static void main(String[] args){
        int[] arr={5,6,7,8,9,2,3,4};
        System.out.print(RotatedArray(arr,0,arr.length-1,9));
        
    }
    static int RotatedArray(int[] arr,int start,int end,int target){
        // 
        if(start>end){
            return -1;
        }
        
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return RotatedArray(arr,start,mid-1,target);
            }
            else{
                return RotatedArray(arr,mid+1,end,target);
            }

        }
        if(target>=arr[mid] && target<=arr[end]){
            return RotatedArray(arr, mid+1, end, target);
        }
        else{
            return RotatedArray(arr, start, mid-1, target); 
        }
    }
    
}
