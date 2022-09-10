package Chapter_29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Betta");
        myList.add("Hamma");
        myList.add("Xy");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Spliterator<String> iterator = myStream.spliterator();
        Spliterator<String> iterator2 = iterator.trySplit();

        if(iterator2 != null){
            iterator2.forEachRemaining(System.out::println);
        }

        iterator.forEachRemaining(System.out::println);
    }
}
