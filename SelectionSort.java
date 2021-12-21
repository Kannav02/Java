import java.util.Arrays;


public class SelectionSort{
    public static void main(String [] args){
        // [4,1,3,5,2]
        int [] arr={4,1,3,5,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        // as the name suggest we will be selecting out the max element in the array and then swap it out with the last element
        // since here the last element gets sorted with each and every pass , we need to keep updating the variable last for each and every pass for which the element will get sorted

        for(int i =0;i<arr.length;i++){
            int lastIndex=arr.length-1-i;
            int max=getMax(arr,lastIndex);
            swap(arr,max,lastIndex);
            
        }
    }
    static int getMax(int[] arr,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int []arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}