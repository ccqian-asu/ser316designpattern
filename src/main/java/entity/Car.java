package entity;

import java.util.ArrayList;

public abstract class Car {

    public abstract String getManufacturer();
    public abstract String getName();
    public abstract String getType();
    public abstract ArrayList<Part> getParts();

    @Override
    public String toString(){
        return "Vehicle: "+this.getManufacturer()+" "+this.getName()+" ("+this.getType()+")";
    }

}
