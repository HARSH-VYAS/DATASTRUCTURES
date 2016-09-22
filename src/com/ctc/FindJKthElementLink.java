package com.ctc;
import com.company.LinkedList;
import com.company.ListNode;
/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class FindJKthElementLink {

    public int returnKthNode(LinkedList list, int k){
        LinkedList linkedList = list;
        ListNode temp = list.getHead();
        ListNode temp2 = list.getHead();
        int t = k;
        while(t!=0){
            temp2 = temp2.next;
            t=t-1;

        }
        while(temp2.next!=null){
            temp=temp.getNext();
            temp2=temp2.getNext();
        }

        return temp.getData();
    }

}
