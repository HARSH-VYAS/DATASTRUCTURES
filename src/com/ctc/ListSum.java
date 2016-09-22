package com.ctc;

import com.company.LinkedList;
import com.company.ListNode;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 9/21/2016.
 */
public class ListSum {

    public LinkedList sumList(LinkedList list1, LinkedList list2){
        LinkedList sum = new LinkedList();
        ListNode node1 = list1.getHead();
        ListNode node2 = list2.getHead();
        int summation =0;
        int carry =0;
        if(list1==null && list2==null)
            return null;

        while(node1!=null && node2!=null){
            summation=node1.getData()+node2.getData()+carry;
            if(summation>9){
                carry=summation/10;
                summation = summation%10;
            }
            ListNode newNode = new ListNode(summation);
            sum.insertAtEnd(newNode);

            node1=node1.getNext();
            node2 =node2.getNext();
        }
        if(node1==null && node2!=null){
            while(node2!=null){
                summation=node2.getData()+carry;
                if(summation>9){
                    carry=summation/10;
                    summation=summation%10;
                }
                ListNode newNode = new ListNode(summation);
                sum.insertAtEnd(newNode);
                node2=node2.getNext();
            }
        }
        if(node2==null && node1!=null){
            while(node1!=null){
                summation=node1.getData()+carry;
                if(summation>9){
                    carry=summation/10;
                    summation=summation%10;
                }
                ListNode newNode = new ListNode(summation);
                sum.insertAtEnd(newNode);
                node1=node1.getNext();
            }
        }
        System.out.println("This is carry: "+carry);
        if(carry>0){
            sum.insertAtEnd(new ListNode(carry));
        }
        return sum;
    }
}
