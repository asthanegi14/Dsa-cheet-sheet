public class PrintName5Time {
    public static void print(String s,int i){
        if(i>5){
            return ;
        }
        System.out.println("Name = "+s);
        print(s,i+1);
    }
    public static void main(String arg[]){
        String s = "Astha";
        print(s,1);
    }
}
