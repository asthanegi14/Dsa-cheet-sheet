class Solution
{
    public static void sort012(int arr[], int n)
    {
        // code here 
        int a=0,b=0,c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                a++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                b++;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                c++;
            }
        }
        int i=0;
        for(i=0;i<a;i++){
            arr[i]=0;
        }
        for(;i<a+b;i++){
            arr[i]=1;
        }
        for(;i<arr.length;i++){
            arr[i]=2;
        }
    }
}
