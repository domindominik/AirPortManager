package main;

import java.util.List;
import java.util.Random;

public class GameEngine
{
    private List<AirPort> airPorts;
    private Random random;

    public GameEngine(List<AirPort> airPorts)
    {
        this.airPorts = airPorts;
        this.random = random;
    }

    public void makeMove()
    {
        int index = random.nextInt(airPorts.size());

        if (airPorts.get(index).getOnEarth().size() > 0)
        {
            int destination = random.nextInt(airPorts.size());
            if (airPorts.get(destination).getOnEarth().size() < 4);
            {
                if (index != destination)
                {
                    airPorts.get(index).getOnEarth().remove(airPorts.size() - 1);
                    airPorts.get(destination).getOnEarth().add(airPorts.get(index).getOnEarth().get(airPorts.get(index).getOnEarth().size() - 1));
                }
            }
        }
    }
}
