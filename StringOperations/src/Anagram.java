import java.util.Arrays;

public class Anagram {
    
   public void isAnagram(String one,String two) {
    boolean status = false;
    if(one.length() != two.length()){
        status = false;
    }else{
        char[] arrayString1 = one.toLowerCase().toCharArray();
        char[] arrayString2 = two.toLowerCase().toCharArray();
        Arrays.sort(arrayString1);
        Arrays.sort(arrayString2);
        status = Arrays.equals(arrayString1, arrayString2);
    }
    if(status){
        System.out.println(one + " and " + two + " are anagrams");
    }else{
        System.out.println(one + " and " + two + " are not anagrams");
    }
   } 
}
