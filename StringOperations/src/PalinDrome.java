public class PalinDrome {
    public boolean palinDromeString(String string , String reverse) {
        boolean isPalinDrome = false;
        if(string.equals(reverse)){
            isPalinDrome = true;
        }else{
            isPalinDrome = false;
        }
        return isPalinDrome;
    }
}
