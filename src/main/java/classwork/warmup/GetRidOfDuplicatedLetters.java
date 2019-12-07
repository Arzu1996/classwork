package classwork.warmup;


import java.util.stream.Collectors;

public class GetRidOfDuplicatedLetters {
    private static String filter(final String toFilter) {
       return toFilter
               .chars()
               .mapToObj(i->(char)i)
               .map(c -> String.valueOf(c))
               .distinct()
               .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String toFilter = "abcdeeff";
        String filtered = filter(toFilter);
        System.out.println(toFilter);
        System.out.println(filtered);
    }
}
