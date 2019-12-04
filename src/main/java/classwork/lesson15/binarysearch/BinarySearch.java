package classwork.lesson15.binarysearch;

public class BinarySearch {
  public boolean search(int[] origin, int number) {
    int l = 0;
    int r = origin.length - 1;
    while(l < r) {
      int m = (l + r) / 2;
      if (origin[m] == number) return true;
      if (number > origin[m]) l = m + 1;
      else r = m - 1;
    }
    return false;
  }
}
