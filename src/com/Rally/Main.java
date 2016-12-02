package com.Rally;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Harsh P Vyas on 10/23/2016.
 */
public class Main {
    public static void main(String args[]){

            List<OfficePoint> nodes;
            List<MazePath> MazePaths;
            MazePath lane;

            nodes = new ArrayList<OfficePoint>();
            MazePaths = new ArrayList<MazePath>();

            for (int i = 0; i < 15; i++) {
                OfficePoint location = new OfficePoint("OfficePoint_" + i, "OfficePoint_" + i);
                nodes.add(location);
            }

                lane = new MazePath("MazePath_0",nodes.get(0),nodes.get(1),85);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_1",nodes.get(0),nodes.get(2),217);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_2",nodes.get(0),nodes.get(4),173);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_3",nodes.get(2),nodes.get(6),186);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_4",nodes.get(2),nodes.get(7),103);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_5",nodes.get(3),nodes.get(7),183);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_6",nodes.get(5),nodes.get(8),250);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_7",nodes.get(8),nodes.get(9),84);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_8",nodes.get(7),nodes.get(9),167);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_9",nodes.get(4),nodes.get(9),502);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_10",nodes.get(9),nodes.get(10),40);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_11",nodes.get(1),nodes.get(10),600);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_11",nodes.get(2),nodes.get(11),90);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_11",nodes.get(3),nodes.get(12),100);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_11",nodes.get(4),nodes.get(13),150);
                MazePaths.add(lane);
                lane = new MazePath("MazePath_11",nodes.get(5),nodes.get(14),170);
                MazePaths.add(lane);


            // Lets check from location Loc_1 to Loc_10
            Maze Maze = new Maze(nodes, MazePaths);
            DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(Maze);

            dijkstra.execute(nodes.get(0));
            LinkedList<OfficePoint> path = dijkstra.getPath(nodes.get(10));

            System.out.println("Path between:"+ nodes.get(0) + " and "+ nodes.get(10));
            int count =0;

            for (OfficePoint OfficePoint : path){
                if(count == path.size()-1)
                    System.out.print(OfficePoint.toString());
                else
                    System.out.print(OfficePoint.toString()+":-> ");
                count++;
            }

        }

}


