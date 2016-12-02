package com.Rally;

/**
 * Created by Harsh P Vyas on 10/23/2016.
 */
public class MazePath {

    private final String id;
    private final OfficePoint source;
    private final OfficePoint destination;
    private final int weight;

    public MazePath(String id, OfficePoint source, OfficePoint destination, int weight) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
        System.out.println("Adding Path from source '"+source+"' to destination '"+ destination + "' distance: " + weight+" Steps");
    }

    public String getId() {
        return id;
    }
    public OfficePoint getDestination() {
        return destination;
    }

    public OfficePoint getSource() {
        return source;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return source + " " + destination;
    }

}
