 
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = {84, 2, 4792, 4692, 3810,8702};
        maxandmin(arr);
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        int kthlar = kthlargest(arr, 2);
        System.out.println(kthlar);
        int kthsma = kthsmallest(arr, 2);
        System.out.println(kthsma);
    }
    public static void maxandmin(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for (int i =0 ;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
    public static void reverseArray(int [] arr){
        int left = 0;
        int right = arr.length-1;
        for(int i = 0;i<arr.length/2;i++){
            int temp= arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }
        
        
    }
    public static int kthlargest(int arr[], int k){
        // Arrays.sort(arr);
        // return arr[arr.length-k];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int val : arr){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    
    public static int kthsmallest (int [] arr, int k ){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int val :arr){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}







