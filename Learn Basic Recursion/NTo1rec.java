public class NTo1rec {

    //Using i-1
//    public static void print(int i, int n){
//        if(i<n){
//            return;
//        }
//        System.out.println(i);
//        print(i-1,n);
//    }
//    public static void main(String[] arg){
//        print(10,1);
//    }

    //using i+1
    public static void print(int i, int n){
        if(i>10){
            return;
        }
        print(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] arg){
        print(1,1);
    }

}
