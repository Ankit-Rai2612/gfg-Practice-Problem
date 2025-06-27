class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int low=0;
        int mid=0, temp;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            
            else if(arr[mid]==1){
            mid++;
            }
            
            else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
        
        public void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
}