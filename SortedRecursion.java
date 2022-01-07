public class SortedRecursion {
    public static void main(String [] args){
        // recursive programme to check if the array is sorted or not ;
        int [] arr ={1,2,3,14,5};
        System.out.print(isSorted(arr,0));

    }
    static boolean isSorted(int []arr,int i){
        if(i==arr.length-1){
            return true;
        }

        return arr[i]<arr[i+1] && isSorted(arr,i+1);
    }
    
}
