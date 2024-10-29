
import java.util.*;
public  class Solution {
     

    public static void romanToInt(String s){
            int c = 0;
            int count=0;
            // int c=0;
            char character = s.charAt(count);
            // Character.toString(character);
            int answer=0;
            String [] arr = new String[s.length()];
            HashMap<String, Integer> map = new HashMap<>();
            int size=s.length();

            map.put("I", 1);
            map.put("V", 5);
            map.put("X", 10);
            map.put("L", 50);
            map.put("C", 100);
            map.put("D", 500);
            map.put("M", 1000);


            for(int i = 0; i<s.length() ;i++){
                arr[i]=Character.toString(s.charAt(i));
            }
             System.out.println(Arrays.toString(arr));
             System.out.println("\n");

 
                int cat=0;
            for (int i=0;i<arr.length;i++){
                if ("I".equals(arr[i]) && "V".equals(arr[i+1])){
                    cat =  map.get(arr[i]) + map.get(arr[i+1]);
                 
                   cat=4;
                }
                else{
                    int b=map.get(arr[i]);
                    cat=cat+b;  
                       
                }

            }
 
            System.out.println(cat);

            // for (String a : arr) {
                
            //         int b=map.get(a);
            //         c=c+b;     
            // } 
            
    }
    public static void main(String[] args) {
        // romanToInt("IV");
        romanToInt("LVIII");
        // romanToInt("LXIV");
    }
}
