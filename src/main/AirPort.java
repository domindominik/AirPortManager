package main;

import java.util.List;

public class AirPort
{
    private String name;
    private List<Plane> onAir;
    private List<Plane> onEarth;
    private boolean isFree;

    public AirPort(String name)
    {
        this.name = name;
        this.onAir = onAir;
        this.onEarth = onEarth;
        this.isFree = isFree;
    }

    public String getName()
    {
        return name;
    }

    public List<Plane> getOnAir()
    {
        return onAir;
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

    public void setOnAir(List<Plane> onAir)
    {
        this.onAir = onAir;
    }
    public void addOnair(Plane plane)
    {
        onAir.add(plane);
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

    public void printInfo()
    {
        System.out.println("Name: " + name +
                ", Planes on earth: " + onEarth.size() +
                ", Planes on air: " + onAir.size());
    }

}