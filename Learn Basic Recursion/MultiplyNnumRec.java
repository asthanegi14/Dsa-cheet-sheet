public class MultiplyNnumRec {
    public static int print(int n){
        if(n==1){
            return 1;
        }
        return (n*print(n-1));
    }
    public static void main(String arg[]){
        System.out.println(print(5));
    }
}
