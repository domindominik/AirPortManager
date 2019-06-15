package main;

public class Plane
{
    private int id;
    private boolean isFlying;
    private AirPort start;
    private AirPort stop;

    public Plane()
    {
        this.id = id;
        this.isFlying = false;
        this.start = start;
        this.stop = null;

    }

    public int getId()
    {
        return id;
    }

    public boolean isFlying()
    {
        return isFlying;
    }

    public AirPort getStart()
    {
        return start;
    }

    public AirPort getStop()
    {
        return stop;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setFlying(boolean flying)
    {
        isFlying = flying;
    }

    public void setStart(AirPort start)
    {
        this.start = start;
    }

    public void setStop(AirPort stop)
    {
        this.stop = stop;
    }
}