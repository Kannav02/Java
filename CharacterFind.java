import java.util.Arrays;





public class CharacterFind {
    public static void main(String[] args){

        //
        char arr[]= {'c','f','j'};
        System.out.println(Find(arr,'d')); 
    }
    static char Find(char arr[],char a){
        int start=0;
        int end=arr.length-1;
        int n =arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>a){   
                end=mid-1;
            }
            else{ 
                start=mid+1;
            }     
    }
    return arr[start%n];
    }
       
}
