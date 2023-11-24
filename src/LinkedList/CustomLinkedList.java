package LinkedList;

public class CustomLinkedList {
    public static void main(String[] args) {
        ListNode n = new ListNode();
        n.data = 1;
        ListNode Head = n;

        ListNode n2 = new ListNode();
        n2.data = 2;
        n.next = n2;

        ListNode n3 = new ListNode();
        n3.data = 3;
        n2.next = n3;

        ListNode temp = Head;
        addNode(Head, 4);
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(test(Head));
    }

    public static int addNode(ListNode Head, int n) {
        ListNode temp = Head;

        while (temp.next != null) {
            temp = temp.next;
        }
        ListNode node = new ListNode();
        node.data = n;

        temp.next = node;
        return n;
    }
    public static int test(ListNode node){
        ListNode temp = node;
        ListNode tempFast = node;

        while(tempFast!=null&& tempFast.next!=null){
            temp = temp.next;
            tempFast = tempFast.next.next;
        }
        return temp.data;
    }
}
