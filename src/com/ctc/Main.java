package com.ctc;

import com.company.LinkedList;
import com.company.ListNode;
import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;

/**
 * Created by Harsh P Vyas on 9/19/2016.
 */
public class Main {

    public static void main(String args[]){

/*
        UniqueChar uc = new UniqueChar();
        uc.identify("abcdefg");
        uc.identify("Thisismycrackingthecode");
*/

/*      CheckPermutation c = new CheckPermutation();
        c.permutation("dog","god");*/

   /*     ReplaceSpace rs = new ReplaceSpace();
        String s = "I am visiting Visa Seminar";
        char [] a = s.toCharArray();
        char [] S= rs.replace(a,a.length);
        System.out.println(S);*/

/*
        PermutationPalindrome pp = new PermutationPalindrome();
        String a = "taco cat";
        String b = "taco cat papa";
        pp.permPali(a);
        pp.permPali(b);*/

/*        StringCompression stringCompression = new StringCompression();
        String s = stringCompression.compressB("aaaabbccc");
        System.out.println(s);*/
        int [][]mat = {{1,2,3},{4,0,6},{7,8,9}};
/*      ImageRotation imageRotation = new ImageRotation();
        imageRotation.rotateImage(mat);*/

       /* NullifyRC nullifyRC = new NullifyRC();
        nullifyRC.checkMat(mat);*/

       /* RotationString rotationString = new RotationString();
        System.out.print(rotationString.checkRotation("waterballa", "erballwat"));*/

        // Remove Duplicates from the linkedlist
        /*LinkedList list = new LinkedList();
        ListNode head = new ListNode(1);
        list.insertAtBegin(head);
        list.insertAtEnd(new ListNode(2));
        list.insertAtBegin(new ListNode(3));
        list.insertAtBegin(new ListNode(4));
        list.insertAtEnd(new ListNode(5));
        list.insertAtEnd(new ListNode(2));
        list.insertAtBegin(new ListNode(7));
        list.insertAtBegin(new ListNode(7));
        String result=  LinkedList.toString(list.getHead());
        System.out.println(result);
        list.removeDups(list.getHead());
        String resu=  LinkedList.toString(list.getHead());
        System.out.println(resu);
        RemoveDupsLink removeDupsLink = new RemoveDupsLink();
        removeDupsLink.removeDups(list);
        String res = LinkedList.toString(list.getHead());
        System.out.println(res);
        FindJKthElementLink findJKthElementLink = new FindJKthElementLink();
        int k = findJKthElementLink.returnKthNode(list,3);
        System.out.println(k);

       *//* PartitionLinkedList p = new PartitionLinkedList();
        LinkedList newList = p.partition(list,3);
        String r = LinkedList.toString(newList.getHead());
        System.out.println(r);*//*

        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        list1.insertAtEnd(new ListNode(2));
        list1.insertAtEnd(new ListNode(3));
        list1.insertAtEnd(new ListNode(4));
        list1.insertAtEnd(new ListNode(9));
        list2.insertAtEnd(new ListNode(7));
        list2.insertAtEnd(new ListNode(8));
        list2.insertAtEnd(new ListNode(9));
        LinkedList sum;
        ListSum listSum = new ListSum();
        sum=listSum.sumList(list1,list2);
        System.out.println(LinkedList.toString(sum.getHead()));
*/

/*        Calculator calculator = new Calculator();
        int result = calculator.calculate("2-6-7*8/2+5");
        System.out.println(result);
        int result1 = calculator.calculate("2-3+5*2+1");
        System.out.println(result1);*/

/*      LRUCache lruCache = new LRUCache(5);

        lruCache.insertInCache(1,"ABC");
        lruCache.insertInCache(2,"BCD");
        lruCache.insertInCache(3,"CDE");
        lruCache.insertInCache(4,"DEF");
        lruCache.insertInCache(5,"EFG");

        String value = lruCache.getValue(2);
        System.out.println(value);
        System.out.println(lruCache.head.key);

        value = lruCache.getValue(1);
        System.out.println(value);
        System.out.println(lruCache.head.key);

        value = lruCache.getValue(3);
        System.out.println(value);
        System.out.println(lruCache.head.key);

        lruCache.insertInCache(6,"EFG");
        System.out.println(lruCache.head.key);
        lruCache.insertInCache(7,"GHI");
        System.out.println(lruCache.head.key);
        lruCache.insertInCache(8,"JKL");
        System.out.println(lruCache.head.key);

        String value1 = lruCache.getValue(5);
        System.out.println(value1);
        System.out.println(lruCache.head.key);*/
    }
}
