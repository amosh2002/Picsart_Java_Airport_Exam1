package main;

import model.Plane;
import service.PlaneService;

public class AirportTest {
    public static void main(String[] args) {
        PlaneService service = new PlaneService();
        //service.create(); - Could be used as well, but I didn't have enough time to input everything each time
        Plane plane1 = new Plane("Boeing", "France", 2002, 3000, false, 10000, 23, 700, 30, 30000);
        Plane plane2 = new Plane("Airbus", "Germany", 1992, 7000, false, 15000, 28, 600, 60, 35000);
        Plane plane3 = new Plane("SU-24-1", "Russia", 2004, 2000, true, 1200, 13, 1100, 4, 20000);
        Plane plane4 = new Plane("SU-24-2", "Rossiya", 2003, 2500, true, 1300, 14, 1050, 5, 16000);
        Plane plane5 = new Plane("SU-24-3", "Rusastan", 2002, 2800, true, 1500, 16, 1020, 5, 14000);
        Plane plane6 = new Plane("SU-24-4", "Russian Federation", 2007, 50, true, 1100, 12, 1200, 4, 25000);
        Plane[] planes = {plane1, plane4, plane2, plane3, plane5, plane6};

        //service.printPlaneInfo(plane1);
        //service.printWithMilitaryCost(plane6);
        //service.printPlaneInfo(service.newerPlane(plane5, plane1));
        //System.out.println(service.biggerWingSpanModel(plane3, plane2));
        //service.printSmallestSeatsCount(plane6, plane1, plane3);
        //service.printAllNotMilitaryPlanes(planes);
        //service.printAllMilitaryPlanesMoreThan100Hours(planes);
        //service.printPlaneInfo(service.minimalWeightPlane(planes));
        //service.printPlaneInfo(service.minimalCostMilitaryPlane(planes));
        //service.printAscendingByYear(planes);
    }
}
