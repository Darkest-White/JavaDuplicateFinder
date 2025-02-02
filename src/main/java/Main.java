import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "banana", "dsfs", "apple");
        List<String> list = DuplicateFinder.findDuplicates(strings);

        System.out.println(list);
    }
}
