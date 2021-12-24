import java.util.ArrayList;

public class NumbersDisappearedInAnArray {
    public static void main(String[] args){

    }
    public ArrayList<Integer> sort(int[] arr){
        ArrayList<Integer> nums= new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct] ){
                swap(arr,i,correct);
            }
            else{
                i++;
            }
        }
    
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                nums.add(index);
            }
        }
        return nums;
        
    }
    static void swap(int []arr,int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    
}
