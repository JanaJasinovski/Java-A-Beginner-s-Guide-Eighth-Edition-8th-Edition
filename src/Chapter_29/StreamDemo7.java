package Chapter_29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Larry", "555-5555",
                "Larry@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("James", "555-4444",
                "James@HerbSchildt.com"));
        myList.add(new NamePhoneEmail("Mary", "555-3333",
                "Mary@HerbSchildt.com"));

        Stream<NamePhone> nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        List<NamePhone> npList = nameAndPhone.toList();

        for(NamePhone namePhone: npList){
            System.out.println(namePhone.name + ": " + namePhone.phonenum);
        }

        nameAndPhone = myList.stream().map(
                (a) -> new NamePhone(a.name, a.phonenum)
        );

        Set<NamePhone> npSet = nameAndPhone.collect(Collectors.toSet());

        for (NamePhone namePhone: npSet){
            System.out.println(namePhone.name + ": " + namePhone.phonenum);
        }
    }
}
