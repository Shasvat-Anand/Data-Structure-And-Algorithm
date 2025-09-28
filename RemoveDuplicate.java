import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        
        // array is sorted -- use linkedHashSet -- order of insertion is prevented 
        int arr [] = {1,1,2,3,4,4}; 
        // array is not sorted -- use TreeSet if you want to be look sorted after removing duplicate element
        // if you just want to remove the duplicate you any of them from ( HashSet, LinkedHashSet).
        int brr [] = {3,2,1,1,5,4}; 
        // array is unsorted -- want to remove duplicate but do not preserve the order of element then use (HashSet)
        int crr [] = {2,3,4,1,4,2,3};


        // in this case you have a sorted array of duplicate element so we are using the LinkedHashSet

        ArrayList<Integer> result =  removeDuplicate(arr);
        System.out.println(result);
    }

    public static ArrayList<Integer> removeDuplicate (int arr[]){

        LinkedHashSet<Integer> rs = new LinkedHashSet<>();
        for(int num : arr){
            rs.add(num);
        }

        ArrayList<Integer> ans = new ArrayList<>(rs);
        return ans;

    }
}
