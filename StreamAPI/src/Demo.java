import java.util.Arrays;
import java.util.List;
// import java.util.stream.Stream;
//Stream API provides lot of manipulation method so we can use these methods on stream instance.
/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(4,5,7,8,9);
        nums.stream() // creation of stream
            .filter(n -> n % 2 ==1)
            .map(n -> n * 2) // mapping the stream and operating on stream
            .forEach(System.out ::println); //printing the mapped data using method reference
        // Stream<Integer> data = nums.stream();
        // Stream<Integer> mappedData = data.map(n -> n*2);
        // mappedData.forEach(n -> System.out.println(n));
        // long count = data.count(); -> return the no. of elements which are available in the stream
        /*
        data.forEach(n -> System.out.println(n));
        If we had already consumed the stream and again we trying the operate upon 
        that same consumed stream it will throw an exception saying that the stream is already
        operated upon and consumed.
        */
    }
}