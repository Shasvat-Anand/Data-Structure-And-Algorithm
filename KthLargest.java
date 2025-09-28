import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int arr [] = {4,5,3,7,9,2,34};
        int k = 3;

        int result = kthlargest(arr,k);
        System.out.println(result);

    }
    public static int kthlargest(int arr[], int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : arr){
            pq.add(num);
        }
        
        int i=1;
        while(i < arr.length - k+1){
          
            pq.poll();

            i++;
        }

       
        return pq.poll();
    }
}
