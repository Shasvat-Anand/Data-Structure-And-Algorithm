 
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int ans = fibonacci(5);
        System.out.println(ans);
        int ans2 = power(5,3);
        System.out.println(ans2);
        String a = reverse("Agrahari");
        System.out.println(a);
        
    }
    public static int fibonacci(int n){
        if(n==1 || n==0) return  1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int power(int a, int n ){
        if (n==0) return 1;
        if(n == a) return a;
        return a*power(a,n-1);
    }
    public static String reverse(String str){
        if(str.length()<=1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
