package classwork.lesson15.merge;

import classwork.lesson15.linkedlist.XLinkedList;


import java.util.StringJoiner;

public class Merge {

  public String toString(XLinkedList.XItem head) {
    StringJoiner sj = new StringJoiner(",","[","]");
    for (XLinkedList.XItem current = head; current != null; current = current.next) {
      sj.add(String.valueOf(current.value));
    }
    return sj.toString();
  }

  public XLinkedList.XItem merge(XLinkedList.XItem head1, XLinkedList.XItem head2) {
    XLinkedList.XItem head;
    XLinkedList.XItem current1 = head1;
    XLinkedList.XItem current2 = head2;
    XLinkedList.XItem current;
    // 1. we dont have an indices, so we have to assign the new head
    // no way. if-statement
    if (current1.value < current2.value) {
      head = current1;
      current = current1;
      current1 = current1.next;
    } else {
      head = current2;
      current = current2;
      current2 = current2.next;
    }
    // 2. rewire all the elements until both of the lists contain elements
    while (current1 != null && current2 != null) {
      if (current1.value < current2.value) {
        current.next = current1;
        current = current1;
        current1 = current1.next;
      } else {
        current.next = current2;
        current = current2;
        current2 = current2.next;
      }
    }
    // 3. rewire all residual elements from non-empty list
    if (current1 != null) {
      current.next = current1;
    }
    if (current2 != null) {
      current.next = current2;
    }

    return head;
  }
}
