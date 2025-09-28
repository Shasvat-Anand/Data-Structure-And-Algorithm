 

import java.util.Arrays;

public class leetcode3467{
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        int brr[] = transformParity(arr);
        System.out.println(Arrays.toString(brr));
    }

    public  static  int [] transformParity(int [] nums){

        for (int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        Arrays.sort(nums);

        return nums;

    }
} 
    

