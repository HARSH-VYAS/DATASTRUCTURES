package com.ctc;
import com.company.LinkedList;
import com.company.ListNode;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class RemoveDupsLink {

    // If buffer is allowed.
    public void removeDups(LinkedList list){
        LinkedList linkedList = list;
        ListNode node = list.getHead();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while(node!=null){
            if(arrayList.contains(node.getData())){
                linkedList.removeMatched(node);
            }
            else
            {
                arrayList.add(node.getData());
            }
            node=node.getNext();
        }
    }

}
