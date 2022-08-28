public class AllPatterns {
    public static void main(String arg[]){
//        rectangle
//        ****
//        ****
//        ****
//        ****
//        ****
//        ****

        for(int i=0;i<6;i++){
            for(int j=0;j<4;j++){
                System.out.print("*");
            }
            System.out.println();
        }


//      half triangle
//        *
//        **
//        ***
//        ****
//        *****

        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                    System.out.print("*");
            }
            System.out.println();
        }

        //half triangle with numbers
        //1
        //12
        //123
        //1234
        //12345

        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //1
        //22
        //333
        //4444
        //55555

        for(int i=1;i<6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

        //inverted triangle

        //*******
        //******
        //*****
        //****
        //***
        //**
        //*

        for(int i=7;i>=0;i--){
            for(int j=i;j>=0;j--){
                System.out.print("*");
            }
            System.out.println();
        }


        //12345
        //1234
        //123
        //12
        //1

        for(int i=5;i>=0;i--){
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        //triangle
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *

        for(int i=0;i<5;i++){
           for(int j=4;j>=i;j--){
               System.out.print(" ");
           }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //reverse triangle
        //* * * * *
        // * * * *
        //  * * *
        //   * *
        //    *

        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        //* * * * * *
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *

        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<=5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=2;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
