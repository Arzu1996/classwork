package classwork.lesson15.binarysearch;

import java.util.Arrays;
import java.util.stream.IntStream;

public class BinarySearchApp {
  private int[] create(int count) {
    int[] ints = new int[count];
    IntStream.range(0, ints.length).forEach(idx -> ints[idx] = (int) (Math.random()*1000));
    return ints;
  }

  public static void main(String[] args) {
    BinarySearchApp app = new BinarySearchApp();
    int[] origin = app.create(1000);
    Arrays.sort(origin);
    BinarySearch binary = new BinarySearch();
    int numberToFind = (int)(Math.random()*1000);
    boolean found = binary.search(origin, numberToFind);
    System.out.printf("Data is: %s\n", Arrays.toString(origin));
    System.out.printf("Number %d %s\n", numberToFind, found ? "is found" : "not found");
  }
}
