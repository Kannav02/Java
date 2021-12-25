public class patterns {
    public static void main(String [] args){
        pattern11(5);

    }
    static void pattern2(int n){
    // *
    // **
    // ***
    // ****
    // *****
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");

        }
        System.out.println();
        }
    }
    static void pattern3(int n){
    // *****
    // ****
    // ***
    // **
    // *
    for(int i=0;i<n;i++){
        for(int j=0;j<=n-1-i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    static void pattern4(int n){
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");

            }
            System.out.println();
        }
    }
    static void pattern5(int n ){
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    for(int i=1;i<=2*n-1;i++){
        int totalColumns=i>n?2*n-i:i;
        for(int j=1;j<=totalColumns;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }
    static void pattern6(int n){
        
    //      *
    //     **
    //    ***
    //   ****
    //  *****
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }
    static void pattern7(int n){
        //  *****
        //   ****
        //    ***
        //     **
        //      *
        for(int i =1;i<=n;i++){
            for(int spaces=1;spaces<=i-1;spaces++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    for(int i =1;i<=n;i++){
        for(int space=1;space<=(2*n-i*2);space++){
            System.out.print(" ");
        }
        for(int j=1;j<i*2;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    static void pattern9(int n){
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    for(int i=0;i<n;i++){
        for(int spaces=0;spaces<i*2;spaces++){
            System.out.print(" ");
        }
        for(int j=0;j<2*n-1-i*2;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    static void pattern10(int n){
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *

    for(int i=0;i<n;i++){
        for(int spaces =0;spaces<n-1-i;spaces++){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }

    }
    static void pattern11(int n){
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    for(int i=0;i<n;i++){
        for(int spaces=0;spaces<i;spaces++){
            System.out.print(" ");
        }
        for(int j=0;j<n-i;j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    }
}
