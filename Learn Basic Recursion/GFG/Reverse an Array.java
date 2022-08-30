import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    public static void print(int[] a,int n){
         for(int j=0;j<n;j++){
	         System.out.print(a[j]+" ");
	     }
	     System.out.println();
    }
    public static void rev(int[] a,int i, int n){
        if(i<=n){
            int temp = a[i];
            a[i] = a[n];
            a[n] = temp;
            rev(a,i+1,n-1);
        }
    }
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t>0){
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    
	    for(int i=0;i<n;i++){
	        a[i] = sc.nextInt();
	    }
	    rev(a,0,n-1);
	    print(a,n);
	    t--;
	 }
	 }
}
