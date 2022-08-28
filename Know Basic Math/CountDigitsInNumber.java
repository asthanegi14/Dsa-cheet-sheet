import java.util.*;

public class CountDigitsInNumber {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("total digits = "+count);
    }
}
