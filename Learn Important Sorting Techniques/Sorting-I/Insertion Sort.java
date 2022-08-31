class Solution
{
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          int min = arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>min){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=min;
      }
  }
}
