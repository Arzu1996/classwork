package classwork.lesson15.linkedlist;

public class XLinkedListBidirectional {

    class XItem {
        int value;
        XItem next;
        XItem prev;

        public XItem(int value) {
            this.value = value;
        }
    }

    private XItem head;

    public XItem getHead() {
        return head;
    }

    public void add(int value) {
        XItem item = new XItem(value);
        if (head == null) {
            head = item;
        } else {
            XItem current = head;
            XItem previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            current.next = item;
            current.prev = previous;
        }
    }

    public boolean contains(int value) {
        XItem current = head;
        while (current != null) {
            if (current.value == value) return true;
            current = current.next;
        }
        return false;
    }

    public void remove(int value) {


        XItem cur = head;
        XItem prev = null;

        while (cur!=null) { //till not deleted
            if(cur.value == value) {

                if(prev == null) {
                    head = cur.next;
                    cur = null;
                    break;
                } else {
                    prev.next = cur.next;
                    cur.next.prev = prev;
                    cur = null;
                    break;
                }
            }

            prev = cur;
            cur = cur.next;
        }
    }
    
}