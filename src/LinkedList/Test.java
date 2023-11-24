package LinkedList;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<Integer>();
//        prevSmaller(new int[]{34,35,27,42,5,28,39,20,28});
//        ListNode n = new ListNode(6);
//        ListNode n1 = new ListNode(3);
//        n.next = n1;
//        ListNode n2 = new ListNode(6);
//        n1.next = n2;
//        ListNode n3 = new ListNode(6);
//        n2.next = n3;

//        ListNode n4 = new ListNode(7);
//        n3.next = n4;
//        ListNode n5 = new ListNode(8);
//        n4.next = n5;
//        ListNode n6 = new ListNode(7);
//        n5.next = n6;
//        ListNode n7 = new ListNode(3);
//        n6.next = n7;
//        ListNode n8 = new ListNode(7);
//        n7.next = n8;
//        lPalin(n);
        System.out.println(solve("xxikrwmjvsvckfrqxnibkcasompsuyuogauacjrr"));
    }

    public static String solve(String A) {
        Queue<Character> queue = new ArrayDeque<Character>();
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            if (hm.containsKey(ch))
                hm.put(ch, hm.get(ch) + 1);
            else
                hm.put(ch, 1);

            if (hm.get(ch) == 1)
                queue.add(ch);

            while (!queue.isEmpty()) {
                if (hm.get(queue.peek()) > 1) {
                    queue.remove();

                } else
                    break;
            }
            if(queue.isEmpty())
                s.append('#');
            else
                s.append(queue.peek());
        }

        // if(!queue.isEmpty())
        //     return "#";
        // else
        return s.toString();
    }
}
