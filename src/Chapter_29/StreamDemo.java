package Chapter_29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println(myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Integer::compare);

        minVal.ifPresent(System.out::println);

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);

        maxVal.ifPresent(System.out::println);

        Stream<Integer> sortedStream = myList.stream().sorted();
        sortedStream.forEach((n) -> System.out.println(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        oddVals.forEach((n) -> System.out.println());

        oddVals = myList.stream().filter((n) -> (n % 2) == 1)
                .filter((n) -> n > 5);

        oddVals.forEach((n) -> System.out.println(n + " "));
    }
}
