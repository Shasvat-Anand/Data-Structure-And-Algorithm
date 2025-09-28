import java.util.*;

public class Rearrange {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr [] ={3,1,-2,-5,2,-4};
        int result [] = rearrange(arr);
        System.out.println(Arrays.toString(result));
 
        
        
        int ans[] = rearrange2(arr);
        System.out.println(Arrays.toString(ans));
         
        
    }
    public static int [] rearrange(int arr[]){
        
        int positive [] = new int[arr.length/2];
        int negative [] = new int[arr.length/2];
        
        int merge [] = new int[arr.length];
         
        int i=0;
        int j=0;
        for(int num : arr){
            if(num>=0){
                positive[i] = num;
                i++;
            }
            else{
                negative[j] = num;
                j++;
            }
        }
        
        int m=0;
        int n=0;
        int l =0;
        
        while(m<merge.length){
            if(m%2==0){
                merge[m]=positive[n];
                n++;
            }
            else{
                merge[m]= negative[l];
                l++;
            }
            m++;
        }
        
        
        
        System.out.println(Arrays.toString(positive));
        System.out.println(Arrays.toString(negative));
        return merge;
    }
    
    public static int[] rearrange2(int arr[]){
        int brr [] = new int[arr.length];
        int p=0;
        int n=1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                brr[n]=arr[i];
                n=n+2;
            }    
            else{
                brr[p]=arr[i];
                p=p+2;
            }
        }
        return brr;
    }
    
    
}
