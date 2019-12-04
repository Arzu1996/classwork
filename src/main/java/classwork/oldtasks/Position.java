package classwork.oldtasks;
import java.util.*;

public class Position {

    public Map<Character, List<Integer>> process(String origin_) {
        String origin = origin_.toLowerCase();
        // unique
        Set<Character> unique = new HashSet<Character>();
        for (int index = 0; index < origin.length(); index++) {
            char c = origin.charAt(index);
            unique.add(c);
        }
        // map initialization with <char, empty list>
        Map<Character, List<Integer>> positions = new HashMap<>();
        for (Character c: unique) {
            positions.put(c,new ArrayList<>());
        }

        for (int index = 0; index < origin.length(); index++) {
            char c = origin.charAt(index);
            positions.get(c).add(index + 1);
        }
        return positions;
    }
    public void printOutput( Map<Character, List<Integer>> data){

    }
    public static void main(String[] args) {
        // 1. data obtaining
        Task1 l4t1 = new Task1();
        final String origin = l4t1.gen_random(80);
        // 2. data process
       Position app = new Position();
        Map<Character, List<Integer>> result = app.process(origin);
        // 3. output the result
        System.out.println(origin);
        System.out.println(result);
    }
}
