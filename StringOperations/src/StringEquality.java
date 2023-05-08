public class StringEquality {

    //Comparison done on String reference
    public void stringEquality(String first, String second) {
        if(first == second){
            System.out.println("Both Strings are Equal");
        }else{
            System.out.println("Both of Strings are not equal");
        }
    }
    //Comparsion done on string value content
    public void stringIdentity(String first,String second) {
        if(first.equals(second)){
            System.out.println("Both Strings are Identical");
        }else{
            System.out.println("Both Strings are not Identical");
        }
    }
}
