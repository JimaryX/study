package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(new String[]{"this", "is", "a", "good boy"}));
        String allLength = list.stream().reduce(String.valueOf(0), (total, word) -> total + word.length());
        /* int allLength = list.stream().mapToInt(String::length).sum(); */
        System.out.println(allLength);

        IntStream stream = IntStream.of(1, 2, 3, 4);
        int max = stream.max().orElse(0);
        System.out.println(max);
    }
}
