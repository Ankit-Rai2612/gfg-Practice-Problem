class Solution {
    static int inversionCount(int arr[]) {
        // Code Here
        int[] temp = new int[arr.length];
        return mergeAndCount(arr, temp,0,arr.length-1);
    }
    private static int mergeAndCount(int[] arr, int[] temp, int left, int right){
        int mid, invCount = 0;
        if(left < right){
            mid = (left+right)/2;
            invCount += mergeAndCount(arr, temp,left,mid);
            invCount += mergeAndCount(arr,temp,mid+1, right);
            invCount += merge(arr,temp,left,mid,right);
        }
        return invCount;
    }
    private static int merge(int[] arr, int[] temp, int left, int mid, int right){
        int i=left;
        int j = mid+1;
        int k = left;
        int invCount = 0;
        
        while(i <= mid && j <= right){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= right){
            temp[k++] = arr[j++];
        }
        for(i = left; i<=right; i++){
            arr[i] = temp[i];
        }
        return invCount;
    }
}