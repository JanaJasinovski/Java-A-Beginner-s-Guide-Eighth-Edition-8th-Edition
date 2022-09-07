package Chapter_19;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if(noVal.isPresent()) System.out.println("No");
        else System.out.println("Yes");

        if(hasVal.isPresent()) System.out.println(hasVal.get());

        String defStr = noVal.orElse("String");
        System.out.println(defStr);
    }
}
