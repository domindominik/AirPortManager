package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu
{
    public static void showAirports(List<AirPort> airPortList)
    {
        for (int i = 0; i < airPortList.size(); i++)
        {
            airPortList.get(i).printInfo();
        }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set airports quantity");
        int quantity = scanner.nextInt();

        Plane plane = new Plane(0);
        List<AirPort> airPortList = new ArrayList<>();
        List<Plane> onAir;

        for (int i = 0; i < quantity; i++)
        {
            System.out.println("Enter Air Port name: ");
            String name = scanner.next();
            airPortList.add(new AirPort(name));
        }
        showAirports(airPortList);

    }
}
