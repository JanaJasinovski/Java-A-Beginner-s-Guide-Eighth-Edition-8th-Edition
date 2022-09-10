package Chapter_29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Betta");
        myList.add("Hamma");
        myList.add("Xy");
        myList.add("Omega");

        Stream<String> myStream = myList.stream();
        Iterator<String> iterator = myStream.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
