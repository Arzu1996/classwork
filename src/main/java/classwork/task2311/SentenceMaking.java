package classwork.task2311;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SentenceMaking {

    public static <T> List<T> list(T... origin) {
        return Arrays.asList(origin);
    }
    public static void main(String[] args) {
        SentenceMaking s= new SentenceMaking();
        List<String> subjects = list("Noel", "The cat", "The dog");
        List<String> verbs =    list("wrote", "chased", "slept on");
        List<String> objects =  list("the book","the ball","the bed");
        List<String> sentences =
                subjects.stream().flatMap(subj ->
                        verbs.stream().flatMap(verb ->
                                objects.stream().map(obj ->
                                        String.format("%s %s %s", subj, verb, obj)
                                ))).collect(Collectors.toList());

        sentences.forEach(System.out::println);
    }




}
