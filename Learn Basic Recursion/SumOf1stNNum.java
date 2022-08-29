public class SumOf1stNNum {

    //parameterised way
//    public static void print(int i,int sum){
//        if(i<0){
//            System.out.println(sum);
//            return;
//        }
//        print(i-1,sum+i);
//    }
//    public static void main(String[] arg){
//        print(8,0);
//    }

    //functional recursion
    public static int print(int n){
        if(n==0){
            return 0;
        }
        return (n+print(n-1));
    }
    public static void main(String[] arg){
        System.out.println(print(8));
    }
}
