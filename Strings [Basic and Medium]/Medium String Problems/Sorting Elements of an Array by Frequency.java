import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc = new Scanner(System.in);
	    int t=sc.nextInt();
	    while(t-->0){
	        int n=sc.nextInt();
	        int[] a = new int[n];
	        HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i=0;i<n;i++){
	            a[i]=sc.nextInt();
	        }
	        for(int i:a){
	            map.put(i,map.getOrDefault(i,0)+1);
	        }
	        
	       // System.out.println(map);
	        List<Integer> arr = new ArrayList(map.keySet());
	        
	        Collections.sort(arr,(x,y)->(map.get(y)-map.get(x)));
	        
	        List<Integer> ans = new ArrayList<>();
	        
	        for(Integer i:arr){
	            for(int j=0;j<map.get(i);j++){
	                ans.add(i);
	            }
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(ans.get(i)+" ");
	        }
	        System.out.println();
	    }
	 }
}
