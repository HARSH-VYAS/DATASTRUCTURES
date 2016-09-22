package com.ctc;
import com.company.LinkedList;
import com.company.ListNode;
import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */

public class PartitionLinkedList {

    public LinkedList partition(LinkedList list, int data){
        ArrayList<Integer> lessArr = new ArrayList<Integer>();
        ArrayList<Integer> moreArr = new ArrayList<Integer>();
        ListNode listNode = list.getHead();
        LinkedList newList = new LinkedList();

        while(listNode.next!=null){
            if(listNode.getData()<data)
                lessArr.add(listNode.getData());
            else
                moreArr.add(listNode.getData());
            listNode= listNode.getNext();
        }

        if(listNode.getData()<data)
            lessArr.add(listNode.getData());
        else
            moreArr.add(listNode.getData());

        for(int i=0;i<lessArr.size();i++){
            ListNode node = new ListNode(lessArr.get(i));
            newList.insertAtBegin(node);
        }

        for(int i=0;i<moreArr.size();i++){
            ListNode node = new ListNode(moreArr.get(i));
            newList.insertAtEnd(node);
        }

        return newList;
    }




}
