// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class Main {
    public static void main(String[] args) {
         
        
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean ans = convery(word);
        
        if(ans==true) {System.out.println("YES");}
        else{System.out.println("NO");}
    }
    public static boolean convery(String str){
        String value = "hello";
        int len = value.length()-1;
        
         
        int j=0;
        
        for(int i=0;i<str.length();i++){
           if(j<= len && str.charAt(i) == value.charAt(j)){
                j++;
            }
        }
        return j==len+1;
    }
}
