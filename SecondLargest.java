 

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {16,11,2,4,5,2};
        int result = secondLargest(arr);
        System.out.println(result);

    }
    public static int secondLargest (int arr[]){
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for (int num : arr){
            if(num > largest){
                largest = num;
            }
            else if( num > sec_largest & num!=largest){
                sec_largest = num;
            }
        }
        return sec_largest;
    }
}
