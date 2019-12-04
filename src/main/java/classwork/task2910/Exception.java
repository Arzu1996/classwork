package classwork.task2910;


public class Exception implements Calculatable {
@Override
    public int calcSum(String origin) {
        if (origin == null) return 0;
        String[] split = origin.split(" ");
        int total = 0;
        for (int i=0; i<split.length; i++) {
            try {
                total += Integer.parseInt(split[i]);
            } catch (NumberFormatException ignore) {}
        }
        return total;
    }

}
