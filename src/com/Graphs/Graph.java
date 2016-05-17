package com.Graphs;

import java.util.ArrayList;

/**
 * Created by Harsh P Vyas on 4/8/2016.
 */
public class Graph {
    int V;
    ArrayList<AdjacencyNode> adjacencyList = new ArrayList<AdjacencyNode>();

    Graph(int v){

        this.V=v;
        for(int i=0;i<v;i++){
            adjacencyList.add(new AdjacencyNode(i));
        }

        for(int i=0;i<v;i++){
            System.out.println("Node:::"+adjacencyList.get(i).value);
        }

    }

    class AdjacencyNode{
        int value;
        AdjacencyNode  next;
        AdjacencyNode(int value){
            this.value= value;
            this.next=null;
        }
    }

    public void addEdge(Graph g ,int src, int des){
        AdjacencyNode dest = new AdjacencyNode(des);
        AdjacencyNode srcn = adjacencyList.get(src);
        AdjacencyNode temp = srcn.next;
        srcn.next=dest;
        dest.next=temp;
    }

   public void bredthFSearch(Graph g, int s){
       boolean visited[] = new boolean[g.V];
       visited[s]=true;
      for(AdjacencyNode n : g.adjacencyList){
           while(n.next!=null){
               if(visited[n.value]!=true){
                   visited[n.value]=true;
                   System.out.println("visited"+n.value);
               }
               n=n.next;
           }
       }
   }

    public void depthFSearch(Graph g, int s){
        boolean visited[] = new boolean[g.V];
        visited[s]=true;
        for(AdjacencyNode n : g.adjacencyList){
            while(n.next!=null){
                if(visited[n.value]!=true){
                    visited[n.value]=true;
                    System.out.println("visited"+n.value);
                }
                n=n.next;
            }
        }
    }

    public void printGraph(Graph g){
         for(AdjacencyNode n : g.adjacencyList){
             System.out.println("Printing the list for"+ n.value);
                    while(n.next!=null){
                        System.out.println("Next Node"+ n.next.value);
                        n=n.next;
                    }
         }
    }


}
