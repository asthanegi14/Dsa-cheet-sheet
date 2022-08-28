package speechConverter;
import java.util.*;
public class prime {
    public static boolean find(int n){
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ans = find(n);
        if(ans){
            System.out.println("Non-Prime");
        }
        else
        System.out.println("Prime");
    }
}
