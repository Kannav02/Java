public class ShuffledString {
    public static void main(String [] args){
        // programme to find the correct string from the shuffled part using the given indices
        String a="codeleet";
        int[] arr={4,5,6,7,0,1,2,3};
        System.out.println(ans(a,arr));

    }
    static String ans(String a,int [] arr){
        int i=0;
        char [] charArray=a.toCharArray();
        while(i<arr.length){
            // we will use here cyclic sort to swap the elements both of the indices and that of the character array 
            int correct=arr[i];
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct,false,charArray);
                swap(arr,i,correct,true,charArray);
            }
            else{
                i++;
            }
        }
        // this is just a function which converts a character array to a string 
        return String.valueOf(charArray);
    }
     
    static void swap(int []arr,int start, int end,boolean isString,char[] a){
        if(isString){
        char temp=a[start];
        a[start]=a[end];
        a[end]=temp;

        }
        else{
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        }
        
        
    }
}
