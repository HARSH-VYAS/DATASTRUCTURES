package com.Rally;

/**
 * Created by Harsh P Vyas on 10/23/2016.
 */
public class OfficePoint {

    final private String id;
    final private String name;

    public OfficePoint(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OfficePoint other = (OfficePoint) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

   @Override
    public String toString() {
        return name;
    }

}
