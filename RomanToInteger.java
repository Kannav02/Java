public class RomanToInteger {
    public static void main(String[]args){
        System.out.print(romanToint("IV"));

    }
    static int romanToint(String s){/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
    int value=0;
    char [] stringArray= s.toCharArray();
    for(int i=0;i<stringArray.length;i++){
        switch(stringArray[i]){
            case 'I':
            if(i<stringArray.length-1 && stringArray[i+1]=='V'){
                value=value+4;
                i=i+1;

            }
            else if(i<stringArray.length-1 && stringArray[i+1]=='X'){
                value=value+9;
                i=i+1;
            }
            else{
                value=value+1;
            }
            break;
            case 'V':
            value=value+5;
            break;
            
            case'X':
            if(i<stringArray.length-1 && stringArray[i+1]=='L'){
                value=value+40;
                i=i+1;
            }
            else if(i<stringArray.length-1 && stringArray[i+1]=='C'){
                value=value+90;
                i=i+1;
            }
            else{
                value=value+10;

            }
            break;
            case 'L':
            value=value+50;
            break;

            case'C':
            if(i<stringArray.length-1 && stringArray[i+1]=='D'){
                value =value+400;
                i=i+1;
            }
            else if(i<stringArray.length-1 && stringArray[i+1]=='M'){
                value=value+900;
                i=i+1;
            }
            else{
                value=value+100;
            }
            break;
            case'D':
            value=value+500;
            break;
            case'M':
            value=value+1000;
            break;


            }

        }
        return value;

    }
    
}
