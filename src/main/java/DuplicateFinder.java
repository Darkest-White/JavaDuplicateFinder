import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinder {
    public static List<String> findDuplicates(List<String> strings) {
        /*return strings.stream()
                .distinct()
                .toList();*/
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String str : strings) {
            if (!seen.add(str)) {
                duplicates.add(str);
            }
        }
        return new ArrayList<>(duplicates);
    }
}
