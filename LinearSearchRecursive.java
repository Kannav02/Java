public class LinearSearchRecursive {
    public static void main(String [] args){
        // this is a recursive programme to find an element in the array
        int[] arr={1,2,3,4,5};
        System.out.print(LinearSearch(arr, 0, 4));

    }
    static boolean LinearSearch(int []arr, int i ,int target){
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || LinearSearch(arr, i+1, target);
    }
    
}
