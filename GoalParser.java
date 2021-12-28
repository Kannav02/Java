public class GoalParser {
    public static void main(String [] args){
        // programme to parse the correct letters and return the string 
        System.out.println(ans("G()()()(al)"));


    }
    static String ans(String command){
        // function to convert string to a character array
        char [] charArray=command.toCharArray();
        // this is a string builder which will be used to make the correct string 
        StringBuilder ans=new StringBuilder();
        int i=0;
       while(i<charArray.length){
        //    if character is G , add g to ans and update the value of i by 1
            if(charArray[i]=='G'){
                ans.append("G");
                i++;

            }
            else if(charArray[i]=='('&& charArray[i+1]==')'){
                // if character at i==( and at i+1==) then append o and update the value by 2 , since we dont want the extra elements
                ans.append("o");
                i=i+2;

            }
            else if(charArray[i]=='(' && charArray[i+1]=='a'){
                // if character at i==( and at i+1 == a append al and update the value by 4 , beacause we want to skip those extra values
                ans.append("al");
                i=i+4;
            }
            else{
                break;
            }
            
        }
        return ans.toString();
    }
    
}
