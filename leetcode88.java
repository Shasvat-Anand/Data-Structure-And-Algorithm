class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
         
            while(i>=0 && j>=0){
                if(arr[i]>brr[j]) arr[k--]=arr[i--];
                else arr[k--]=brr[j--];
            }
            while(j>=0){
                arr[k--]=brr[j--];
            }
       
        
    }
}
