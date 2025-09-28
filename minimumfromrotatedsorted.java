public class minimumfromrotatedsorted {
    public static void main(String[] args) {
        int arr [] = {4,5,6,7,1,2,3};
        
        int result = minimumfromrotatedsorted(arr);
        int ans = formaximum(arr);

        System.out.println(result);
        System.out.println(ans);
        
    }
    public static int minimumfromrotatedsorted(int arr[]){
        int low =0;
        int high = arr.length-1;

        while(low < high){
            int mid = low + (high -low)/2;

            if(arr[mid] > arr[ high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return arr[low];
    }

    public static int formaximum(int arr[]){
        int low =0;
        int high = arr.length -1;

        while(low < high){
            int mid = low + (high - low)/2;
            if(arr[mid] >arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }

        int minindx = low;
        int maxindx = (minindx - 1 + arr.length)% arr.length ;
        return arr[maxindx];
    }
}
