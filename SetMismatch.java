public class SetMismatch {
    public static void main(String [] args){
        // 
    }
    static int[] sort(int []arr){
        int[] nums=new int[2];
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
            if(arr[index]!=index+1){

                nums[0]=index+1;
                nums[1]=arr[index];
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
    

