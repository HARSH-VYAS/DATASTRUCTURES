package com.ctc;
import com.company.LinkedList;
import com.company.ListNode;
/**
 * Created by Harsh P Vyas on 9/22/2016.
 */
public class PalindromeLinkedList {

    public boolean palindromeList(LinkedList list){
        if(list==null)
            return false;
        ListNode reverse = findReverse(list.getHead());
        return  isEqual(list.getHead(),reverse);
    }


    public ListNode findReverse(ListNode node){
        ListNode head = null;
        while(node!=null){
            ListNode n = new ListNode(node.getData());
            n.next= head;
            head=n;
            node=node.next;
        }
        return head;
    }

    public boolean isEqual(ListNode node1, ListNode node2){
        while(node1!=null && node2!=null){
            if(node1!=node2)
                    return false;
            node1=node1.getNext();
            node2=node2.getNext();
        }

        return true;
    }
}
