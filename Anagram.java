import java.io.*;
import java.util.Map; 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.HashMap; 

public class Anagram{

     public static void main(String []args){
        String s1 = "MYANAGRAM";
        String s2 = "GRAMMYNAA";
        boolean flag = isAnagram(s1, s2);
        System.out.println(flag);
        //printArray(array);
     }
     
     
     //using hashmaps: causes TLE error
     /*public static boolean isAnagram(String s1, String s2){
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         int i=0;
         if(s1.length()!=s2.length())
         return false;
             int value = 0;
             while(i<s1.length()){
                 if(map.containsKey(s1.charAt(i))){
                     value = map.get(s1.charAt(i));
                     map.put(s1.charAt(i), value+1);
                 }else{
                     map.put(s1.charAt(i), 1);
                 }
                 i++;
             }
             
             i = 0;
             while(i<s2.length()){
                 if(map.containsKey(s2.charAt(i))){
                     value = map.get(s2.charAt(i));
                     map.put(s2.charAt(i), value-1);
                 }else{
                     return false;
                 }
             }
             
             for(Map.Entry<Character,Integer> entry : map.entrySet()){
                 if(entry.getValue() != 0)
                 return false;
             }
         return true;
     }*/
     
     //using array:44MB
     /*public static boolean isAnagram(String s1, String s2){
         int[] checkSum = new int[256];
         int i = 0;
         if(s1.length()!=s2.length())
         return false;
         while(i<s1.length()){
             checkSum[s1.charAt(i)]++;
             i++;
         }
         i = 0;
         while(i<s2.length()){
             checkSum[s2.charAt(i)]--;
             i++;
         }
         for(i = 0;i<checkSum.length;i++){
             if(checkSum[i]!=0)
             return false;
         }
     return true;
     }*/
     
     // String equality: 42 MB
     public static boolean isAnagram(String s1, String s2){
         char[] c1 = s1.toCharArray();
         char[] c2 = s2.toCharArray();
         int a1 = s1.length();
         int a2 = s2.length();
         if(a1 != a2)
         return false;
         
        Arrays.sort(c1); 
        Arrays.sort(c2); 
        
        s1 = String.valueOf(c1);
        s2 = String.valueOf(c2);
         if(s1.equals(s2))
         return true;
         return false;
     }
     
     public static void printArray(int[] array){
         System.out.println("---------------------------");
         for(int i=0;i<array.length; i++){
             System.out.print(array[i]+" ");
         }
         System.out.println();
     }
}
