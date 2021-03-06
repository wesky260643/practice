package org.buaa.nlp.cj.leetcode;

/**
 * Created by Administrator on 2015/5/17.
 */
public class ListNode implements Comparable<ListNode> {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    public void listPrint() {
        ListNode p = this;
        while (p != null) {
            System.out.print(p.val);
            System.out.print(" ");
            p = p.next;
        }
        System.out.println();
    }

    @Override
    public int compareTo(ListNode o) {
        if (this.val < o.val)
            return -1;
        else if (this.val > o.val)
            return 1;
        else
            return 0;
    }
}
