package main;

import java.util.List;

public class AirPort
{
    private String name;
    private List<Plane> onEarth;
    private boolean isFree;

    public AirPort(String name)
    {
        this.name = name;
        this.onEarth = onEarth;
        this.isFree = isFree;
    }

    public String getName()
    {
        return name;
    }


    public List<Plane> getOnEarth()
    {
        return onEarth;
    }

    public boolean isFree()
    {
        return isFree;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addOnair(Plane plane)
    {
        onEarth.add(plane);
    }
    public void setOnEarth(List<Plane> onEarth)
    {
        this.onEarth = onEarth;
    }
    public void addOnEarth(Plane plane)
    {
        onEarth.add(plane);
    }

    public void setFree(boolean free)
    {
        isFree = free;
    }

    public void addPlane(Plane plane)
    {
        onEarth.add(plane);
    }

    public void printInfo()
    {
        System.out.println("Name: " + name +
                ", Planes on earth: " + onEarth.size());

    }

}