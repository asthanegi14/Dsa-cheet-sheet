class Solution
{
    int search(int a[], int l, int h, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function
        while(l<=h){
            int mid=l+(h-l)/2;
            if(a[mid]==key){
                return mid;
            }
            if(a[mid]>=a[l]){
                if(a[l]<=key && a[mid]>=key){
                    h=mid-1;
                }
                else
                    l=mid+1;
            }
            else{
                if(a[mid]<=key && a[h]>=key){
                    l=mid+1;
                }
                else
                    h=mid-1;
            }
        }
        return -1;
    }
}
