package classwork.lesson15.merge;


import classwork.lesson15.linkedlist.XLinkedList;

public class MergeApp {
  public static void main(String[] args) {
    XLinkedList xl1 = new XLinkedList();
    xl1.add(1);
    xl1.add(3);
    xl1.add(5);
    xl1.add(7);
    xl1.add(9);
    XLinkedList xl2 = new XLinkedList();
    xl2.add(2);
    xl2.add(4);
    xl2.add(6);
    xl2.add(10);
    xl2.add(100);
    System.out.printf("XL1:%s\n", xl1);
    System.out.printf("XL2:%s\n", xl2);
    Merge app = new Merge();
    XLinkedList.XItem merged = app.merge(xl1.getHead(), xl2.getHead());
    System.out.printf("Merged: %s\n", app.toString(merged));
  }
}
