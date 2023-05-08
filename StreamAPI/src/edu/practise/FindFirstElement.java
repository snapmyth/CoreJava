package edu.practise;

import java.util.stream.Stream;

public class FindFirstElement {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Geek_First", "Geek_2",
                "Geek_3", "Geek_4",
                "Geek_Last");
        System.out.println("First Element: " + firstElementStream(stream) );
    }

    public static <T> T firstElementStream(Stream<T> stream) {
        T first_Element = stream.reduce((first,second) -> first)
                                .orElse(null);
        return first_Element;
    }
}
