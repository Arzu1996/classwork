package classwork.warmup0712;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Repetitions {
    public static void main(String[] args) {
        List<Integer> generate = generate();
        Map<Integer, Long> integerLongMap = calcRepetitions(generate);
        Integer aLong = minRepetitions(integerLongMap);
        System.out.println(generate);
        System.out.println(integerLongMap);
        System.out.println(aLong);

    }

    private static Integer minRepetitions(Map<Integer, Long> integerLongMap) {
        Integer min = Collections.min(integerLongMap.entrySet(),Map.Entry.comparingByValue()).getKey();
        return min;
    }

    private static Map<Integer, Long> calcRepetitions(List<Integer> generate) {
     return generate.stream().collect(Collectors.groupingBy(k->k,Collectors.counting()));

    }


    private static List<Integer> generate() {
        List<Integer> collect = Stream
                .generate(() -> (int) (Math.random() * 10 + 15))
                .limit(50).collect(Collectors.toList());
        return collect;
    }
}
