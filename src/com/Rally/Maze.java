package com.Rally;

import java.util.List;

/**
 * Created by Harsh P Vyas on 10/23/2016.
 */
public class Maze {

    private final List<OfficePoint> officePoints;
    private final List<MazePath> mazePaths;

    public Maze(List<OfficePoint> officePoints, List<MazePath> mazePaths) {
        this.officePoints = officePoints;
        this.mazePaths = mazePaths;
        System.out.println("Finalized Maze");
    }

    public List<OfficePoint> getOfficePoints() {
        return officePoints;
    }

    public List<MazePath> getMazePaths() {
        return mazePaths;
    }


}
