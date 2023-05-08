public class ReverseOperations {
    public String revereOperation(String string) {
        String reverse = "";
        for(int i = string.length() - 1; i > -1 ; i--) {
            reverse += string.charAt(i);
        }
        return reverse;
    }
}
