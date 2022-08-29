public class OneTo10rec {

    //Using i+1
//    public static void print(int i,int n){
//        if(i>n){
//            return;
//        }
//        System.out.println(i);
//        print(i+1,n);
//    }
//    public static void main(String[] arg){
//        print(1,10);
//    }


    //Using i-1

    public static void print(int i,int n){
        if(i<1){
            return;
        }
        print(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] arg){
        print(10,10);
    }
}
