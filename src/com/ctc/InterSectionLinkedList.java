package com.ctc;

import com.company.LinkedList;
import com.company.ListNode;

/**
 * Created by Harsh P Vyas on 9/22/2016.
 */
public class InterSectionLinkedList {

    public ListNode findInterSection(LinkedList list1, LinkedList list2){

        if(list1==null && list2==null)
            return null;
        Result result1 = findLengthTail(list1.getHead());
        Result result2 = findLengthTail(list2.getHead());

        if(result1!=result2)
            return null;
        ListNode shorter = result1.length <result2.length?list1.getHead():list2.getHead();
        ListNode longer = result1.length <result2.length?list1.getHead():list2.getHead();
        longer = findKthNode(longer,Math.abs(result1.length-result2.length));

        while(shorter!=longer){
            shorter=shorter.next;
            longer=longer.next;
        }
        return shorter;
    }

    public ListNode findKthNode(ListNode node, int k){
        while(k>0){
            node =node.next;
            k--;
        }
        return node;
    }

    private class Result{
        int length;
        ListNode tail;
        Result(ListNode tail, int length){
            this.length=length;
            this.tail = tail;
        }
    }

    public Result findLengthTail(ListNode node){
       int length=0;
        if(node==null)
            return null;
        while(node!=null){
            node=node.next;
            length++;
        }
        return new Result(node,length);

    }




}
