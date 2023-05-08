package edu.practise;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Stream {
    public static void main(String[] args) {
        // count the empty string
        List<String> strList = Arrays.asList("abc", "defg", "", "", "bcd", "jk");
        long count = strList.stream()
                .filter(x -> x.isEmpty())
                .count();
        System.out.println("List " + strList + " has " + count + " empty strings");
        // count string with length more than 3
        long num = strList.stream()
                .filter(x -> x.length() > 3)
                .count();
        System.out.printf("List %s has %d strings of length more than 3 %n", strList, num);

        // count number of string which starts with 'a'
        count = strList.stream()
                .filter(x -> x.startsWith("a"))
                .count();
        System.out.printf("List %s has %d strings which startsWith 'a' %n", strList, count);

        //Remove all empty string from list
        List<String> filtered = strList.stream()
                                        .filter(e -> !e.isEmpty())
                                        .collect(Collectors.toList());
        System.out.println("Original List : " + strList + " List Without Empty String: " + filtered);     
        
        //create a list with string more than 2 characters
        filtered = strList.stream()
                          .filter(e -> e.length() > 2)
                          .collect(Collectors.toList());
        System.out.println("Original List : " + strList + " Filtered List: " + filtered);   
        
        //Convert String to Uppercase and join them using coma
        List<String> countryList = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String countryUppercase = countryList.stream()
                                              .map(x -> x.toUpperCase())
                                              .collect(Collectors.joining(","));
        System.out.println("Countries Names in Uppercase:  " + countryUppercase);

        //Create a list of square of all distinct number
        List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
        List<Integer> distinct = numbers.stream()
                                        .map(e -> e * e).distinct() // distinct removes the duplicates
                                        .collect(Collectors.toList());
        System.out.println("Original List: " + numbers + " Square without duplicates: " + distinct);             
        
        //get count , min , max , sum  and average of numbers 
        List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
        IntSummaryStatistics stats = primes.stream()
                                           .mapToInt((x) -> x)
                                           .summaryStatistics();
        System.out.println("Highest prime number in list: " + stats.getMax());                                   
        System.out.println("Lowest prime number in list: " + stats.getMin());                                   
        System.out.println("Sum of all prime number in list: " + stats.getSum());                                   
        System.out.println("Average of all prime number in list: " + stats.getAverage());                                   
                                                

    }
}
