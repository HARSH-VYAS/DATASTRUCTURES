package com.Graphs;

/**
 * Created by Harsh P Vyas on 4/5/2016.
 */
public class Main {
    public static void main(String [] args){

        int V=5;
        Graph g = new Graph(V);
        g.addEdge(g,0,1);
        g.addEdge(g,0,2);
        g.addEdge(g,1,1);
        g.addEdge(g,1,2);
        g.addEdge(g,1,3);
        g.addEdge(g,2,3);
        g.addEdge(g,2,4);
        g.addEdge(g,4,3);
        //g.printGraph(g);
        g.breadthFSearch(g,0);
        g.depthFSearch(g,0);
        g.printGraph(g);




    }
}
