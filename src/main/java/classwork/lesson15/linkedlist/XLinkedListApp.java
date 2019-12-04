package classwork.lesson15.linkedlist;

public class XLinkedListApp {
  public static void main(String[] args) {
    XLinkedList xl = new XLinkedList();
    xl.add(11);
    xl.add(22);
    xl.add(33);
    xl.add(44);

//    boolean b11 = xl.contains(11); // true
//    boolean b12 = xl.contains(12); // false
    System.out.println(xl); // [11,22,33,44]
    xl.revert_while();
    System.out.println(xl); // [44,33,22,11]
    xl.revert_recursive();
    System.out.println(xl); // [44,33,22,11]
//    System.out.println(xl.length());   // 4
//    System.out.println(xl.lengthr());  // 4
//    System.out.println(xl.lengthr2()); // 4
  }
}
