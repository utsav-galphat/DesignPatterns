package Problems.mergeTwoList;

class Solution {


    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        mergeTwoLists(n1, n2);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head;

        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        ListNode list3;

        list3 = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list3.next = list1;
                list1 = list1.next;
                list3 = list3.next;
            } else {
                list3.next = list2;
                list2 = list2.next;
                list3 = list3.next;
            }
        }

        while (list1 != null) {
            list3.next = list1;
            list1 = list1.next;
            list3 = list3.next;
        }
        while (list2 != null) {
            list3.next = list2;
            list2 = list2.next;
            list3 = list3.next;
        }
        return head;
    }
}