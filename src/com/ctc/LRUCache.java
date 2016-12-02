package com.ctc;

import com.company.LinkedList;

import java.util.HashMap;

/**
 * Created by Harsh P Vyas on 11/23/2016.
 */
public class LRUCache {

    public class LinkedListNode{
        LinkedListNode next=null, prev=null;
        int key;
        String value;
        LinkedListNode(int key, String value){
            this.key=key;
            this.value=value;
            next=prev=null;
        }
    }

    int maxSize =0;
    HashMap<Integer,LinkedListNode> map = new HashMap<Integer, LinkedListNode>();
    LinkedListNode head, tail;
    int cacheSize=0;

    LRUCache(int size){
        this.maxSize=size;
    }

    public String getValue(int key){
        String  value=null;
        if(map.size()==0)
            return null;

        if(!map.containsKey(key))
            return "No Key present";

        else{
            value = map.get(key).value;
            removeNode(map.get(key));
            map.remove(key);
            insertAtBeginning(new LinkedListNode(key,value));
        }
        return value;
    }



    public void insertInCache(int key,String value){

        if(map.containsKey(key)){
            removeNode(map.get(key));
            map.remove(key);
        }
        LinkedListNode newListNode = new LinkedListNode(key,value);
        insertAtBeginning(newListNode);
        map.put(key,newListNode);
    }

    public void insertAtBeginning(LinkedListNode node){

        if(head==null){
            head=tail=node;
            cacheSize++;
        }
        else {
            if(cacheSize == maxSize){
                removeFromEnd();
            }
            node.next = head;
            head.prev = node;
            head = node;

            if(tail==head){
                tail = head.next;
            }
            cacheSize++;
        }
    }

    public void removeNode(LinkedListNode node){
        LinkedListNode temp  = head;

        while(temp.next.key != node.key)
                temp = temp.next;

        if(temp.next==tail){
            System.out.println("removed node" + tail.key);

            tail = tail.prev;
            tail.next=null;
        }
        else{
            System.out.println("removed node" + temp.next.key);
            temp.next = temp.next.next;
            temp.next.prev=temp;

        }
        cacheSize--;
        System.out.println("Cache size"+ cacheSize);
    }

    public void removeFromEnd(){
        if(head==null){
            return;
        }
        else{
            System.out.println("removed node" + tail.key);
            tail =tail.prev;
            tail.next=null;
        }

        cacheSize--;
        System.out.println("Cache size"+ cacheSize);

    }

}
