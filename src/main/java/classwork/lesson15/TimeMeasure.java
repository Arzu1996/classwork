package classwork.lesson15;

public class TimeMeasure {
  public static void main(String[] args) {
    long was = System.currentTimeMillis();
    // ...
    // time consumption code
    // ...
    long now = System.currentTimeMillis();
    long delta = now - was; // 1s = 1000ms
    System.out.printf("The running took %d milliseconds\n", delta);
  }
}
