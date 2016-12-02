package com.Rally;

import java.util.*;

/**
 * Created by Harsh P Vyas on 10/23/2016.
 */
public class DijkstraAlgorithm {



    private final List<OfficePoint> nodes;
    private final List<MazePath> MazePaths;
    private Set<OfficePoint> solvedSet;
    private Set<OfficePoint> unSolvedSet;
    private Map<OfficePoint, OfficePoint> parent;
    private Map<OfficePoint, Integer> path;

    public DijkstraAlgorithm(Maze Maze) {
        // create a copy of the array so that we can operate on this array
        this.nodes = new ArrayList<OfficePoint>(Maze.getOfficePoints());
        this.MazePaths = new ArrayList<MazePath>(Maze.getMazePaths());
    }

    public void execute(OfficePoint source) {

        solvedSet = new HashSet<OfficePoint>();
        unSolvedSet = new HashSet<OfficePoint>();
        path = new HashMap<OfficePoint, Integer>();
        parent = new HashMap<OfficePoint, OfficePoint>();
        path.put(source, 0);
        unSolvedSet.add(source);
        while (unSolvedSet.size() > 0) {
            OfficePoint node = getMinimum(unSolvedSet);
            solvedSet.add(node);
            unSolvedSet.remove(node);
            findMinpath(node);
        }
    }

    private void findMinpath(OfficePoint node) {
        List<OfficePoint> adjacentNodes = getNeighbors(node);
        for (OfficePoint target : adjacentNodes) {
            if (getShortestPath(target) > getShortestPath(node) + getpath(node, target)) {
                path.put(target, getShortestPath(node) + getpath(node, target));
                parent.put(target, node);
                unSolvedSet.add(target);
            }
        }
    }

    private int getpath(OfficePoint node, OfficePoint target) {
        for (MazePath MazePath : MazePaths) {
            if (MazePath.getSource().equals(node)
                    && MazePath.getDestination().equals(target)) {
                return MazePath.getWeight();
            }
        }
        throw new RuntimeException("Should not happen");
    }

    private List<OfficePoint> getNeighbors(OfficePoint node) {
        List<OfficePoint> neighbors = new ArrayList<OfficePoint>();
        for (MazePath MazePath : MazePaths) {
            if (MazePath.getSource().equals(node)
                    && !isSettled(MazePath.getDestination())) {
                neighbors.add(MazePath.getDestination());
            }
        }
        return neighbors;
    }

    private OfficePoint getMinimum(Set<OfficePoint> OfficePoints) {
        OfficePoint minimum = null;
        for (OfficePoint OfficePoint : OfficePoints) {
            if (minimum == null) {
                minimum = OfficePoint;
            } else {
                if (getShortestPath(OfficePoint) < getShortestPath(minimum)) {
                    minimum = OfficePoint;
                }
            }
        }
        return minimum;
    }

    private boolean isSettled(OfficePoint OfficePoint) {
        return solvedSet.contains(OfficePoint);
    }

    private int getShortestPath(OfficePoint destination) {
        Integer d = path.get(destination);
        if (d == null) {
            return Integer.MAX_VALUE;
        } else {
            return d;
        }
    }

    public LinkedList<OfficePoint> getPath(OfficePoint target) {

        LinkedList<OfficePoint> path = new LinkedList<OfficePoint>();
        OfficePoint step = target;

        // check if a path exists
        if (parent.get(step) == null) {
            return null;
        }
        path.add(step);
        while (parent.get(step) != null) {
            step = parent.get(step);
            path.add(step);
        }
        // Put it into the correct order
        Collections.reverse(path);
        return path;
    }

}
