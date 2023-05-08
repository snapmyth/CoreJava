public class Immutability {
    public void referenceCheck(Object x, Object y) {

        if (x == y) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }

    }
}
