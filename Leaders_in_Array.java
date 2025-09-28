import java.util.ArrayList;
 
import java.util.Collections;

class Leaders_in_Array{
    public static void main(String[] args) {
        int arr[] = {16,17,2,4,5,2};
        ArrayList<Integer> result = Leaders(arr);
        System.out.println(result);



    }
    public static ArrayList<Integer> Leaders (int arr[]){
        
        ArrayList<Integer> rs = new ArrayList<>();
        int l = arr.length;
         int current_max = arr[l-1];
        rs.add(current_max);

        for (int i=l-2;i>=0;i--){
            if(arr[i]>current_max){
                rs.add(arr[i]);
                current_max = arr[i];
            }

        }
        Collections.reverse(rs);
        return rs;

    }
}


// // Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
// class Main {
//     public static void main(String[] args) {
//         System.out.println("Try programiz.pro");
        
//         int arr[] = {16,17,2,4,5,2};
//         ArrayList<Integer> rs = Leaders(arr);
//         Collections.reverse(rs);
//         System.out.println(rs);
        
//         int a = secondlargest (arr);
//         System.out.println(a);
        
//         int brr [] ={2,2,3,4,4,5};
//         ArrayList<Integer> dup = removeduplicate(brr);
//         System.out.println(dup);
//     }
    
//     public static ArrayList<Integer>Leaders(int arr[]){
//         int n = arr.length;
//         int current_max = arr[n-1];
//         ArrayList<Integer> result = new ArrayList<Integer>();
//         result.add(current_max);
        
//         for( int i=n-2;i>=0;i--){
//             if(arr[i]>=current_max){
//                 result.add(arr[i]);
//                 current_max = arr[i];
//             }
//         }
        
//         return result;
//     }
    
//     public static int secondlargest (int arr[]){
//         int l = arr.length;
//         Arrays.sort(arr);
//         int ans =arr[l-2];
//         return ans;
        
//     }
    
    
//     public static ArrayList<Integer> removeduplicate (int arr[]){
//         int l = arr.length;
        
//         // LinkedHashSet<Integer> set = new LinkedHashSet<>(); this is use when order is maintain on insertion of element
        
//         // HashSet<Integer> set = new HashSet<>(); this is use when order is not matter of fact.
        
//         TreeSet<Integer> set = new TreeSet<>();
//         // This is use when we want the given is sorted after remove the element.
        
//         for (int num : arr){
//             set.add(num);
//         }
//         ArrayList<Integer> rs = new ArrayList<>(set);
        
        
    
//         return rs;
//     }
// }






















