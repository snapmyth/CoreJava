public class StringOperations {
    public static void main(String[] args) throws Exception {
        String first = "hello";
        String second = new String("hello");
        String third = first;
        String forth = new String("hello");
        String fifth = first + "mike";
        String sixth = "hellomike";
        StringEquality se = new StringEquality();
        se.stringEquality(first, second); // not equals
        se.stringIdentity(third, first); // identical
        se.stringEquality(first, third); // equals
        se.stringEquality(second, forth); // not equals
        se.stringIdentity(second, forth); // but identical
        se.stringEquality(fifth, sixth); // not 
        se.stringIdentity(fifth, sixth); //identical
        System.out.println("--------------------------");
        System.out.println("Original String: " + sixth);
        ReverseOperations reverse = new ReverseOperations();
        System.out.println("Reverse String: " + reverse.revereOperation(sixth));
        System.out.println("--------------------------");
        PalinDrome p = new PalinDrome();
        String original = "madam";
        String reverseString = reverse.revereOperation(original);
        boolean flag = p.palinDromeString(original, reverseString);
        if(flag){
            System.out.println("YES");
        }
        System.out.println("--------------------------");
        String string1 = "Java";
        String string2 = "Java";
        System.out.println("Before Modification in string1");  
        Immutability i = new Immutability();
        i.referenceCheck(string1, string2);
        string1 += "ava";
        System.out.println("After Modification"); 
        i.referenceCheck(string1, string2);
        System.out.println("--------------------------");
        String stringone = "Keep";
        String stringtwo = "Peek";
        Anagram anagram = new Anagram();
        anagram.isAnagram(stringone, stringtwo);
        System.out.println("--------------------------");
    }
}
