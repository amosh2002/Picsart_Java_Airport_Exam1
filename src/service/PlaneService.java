package service;

import model.Plane;

import java.util.Scanner;

public class PlaneService {
    public Plane create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Model: ");
        String model = sc.nextLine();
        System.out.print("Country: ");
        String country = sc.nextLine();
        System.out.print("Cost: ");
        double cost = sc.nextDouble();
        System.out.print("Hours: ");
        int hours = sc.nextInt();
        System.out.print("Seats: ");
        int seats = sc.nextInt();
        System.out.print("Top speed: ");
        int topSpeed = sc.nextInt();
        System.out.print("Weight: ");
        int weight = sc.nextInt();
        System.out.print("Wingspan: ");
        int wingSpan = sc.nextInt();
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Is Military? Y/N: ");
        boolean isMilitary = sc.next().charAt(0) == 'Y';

        return new Plane(model, country, year, hours, isMilitary, weight, wingSpan, topSpeed, seats, cost);
    }


    /*
    Task 1. (score 5)
    Create function:
    Parameter one Plane
    Result: print all information of the plane
    */
    public void printPlaneInfo(Plane plane) {

        System.out.println("**********");
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Cost: " + plane.getCost());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Top speed: " + plane.getTopSpeed());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Type: " + (plane.isMilitary() ? "Military" : "Not Military"));
    }


    /*
    Task 2. (score 5)
    Create function:
    Parameter one Plane
    Result: print cost and topSpeed if the plane is military otherwise print model and country
    */
    public void printWithMilitaryCost(Plane plane) {
        System.out.println("Task 2");

        System.out.println("**********");
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost());
            System.out.println("Top speed: " + plane.getTopSpeed());
            return;
        }
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
    }


    /*
    Task 3. (score 7)
    Create function:
    Parameter two Planes
    Result: return the plane which one is newer (if they have the same age return first one).
     */
    public Plane newerPlane(Plane p1, Plane p2) {
        System.out.println("Task 3");

        if (p1.getYear() >= p2.getYear()) {
            return p1;
        }
        return p2;
    }


    /*
    Task 4. (score 7)
    Create function:
    Parameter two Planes
    Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
     */
    public String biggerWingSpanModel(Plane p1, Plane p2) {
        System.out.println("Task 4");

        if (p2.getWingspan() >= p1.getWingspan()) {
            return p2.getModel();
        }
        return p1.getModel();
    }


    /*
    Task 5. (score 7)
    Create function:
    Parameter three Planes
    Result: print country of the plane with smallest seats count (if they have the same - print first).
     */
    public void printSmallestSeatsCount(Plane p1, Plane p2, Plane p3) {
        System.out.println("Task 5");
        Plane smallestPlane12 = p1.getSeats() <= p2.getSeats() ? p1 : p2;
        Plane smallestPlane = smallestPlane12.getSeats() <= p3.getSeats() ? smallestPlane12 : p3;

        System.out.println("Country: " + smallestPlane.getCountry());


    }


    /*
    Task 6. (score 7)
    Create function:
    Parameter array of Planes
    Result: print all not military planes.
     */
    public void printAllNotMilitaryPlanes(Plane[] planes) {
        System.out.println("Task 6");

        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                printPlaneInfo(plane);
            }
        }
    }


    /*
    Task 7. (score 10)
    Create function:
    Parameter array of Planes
    Result: print all military planes which were in air more than 100 hours.
     */
    public void printAllMilitaryPlanesMoreThan100Hours(Plane[] planes) {
        System.out.println("Task 7");

        for (Plane plane : planes) {
            if (plane.isMilitary() && plane.getHours() > 100) {
                printPlaneInfo(plane);
            }
        }
    }


    /*
    Task 8. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal weight (if there are some of them return last one).
     */
    public Plane minimalWeightPlane(Plane[] planes) {
        System.out.println("Task 8");

        Plane minWeightPlane = planes[0];
        for (Plane plane : planes) {
            if (plane.getWeight() <= minWeightPlane.getWeight()) {
                minWeightPlane = plane;
            }
        }
        return minWeightPlane;
    }


    /*
    Task 9. (score 10)
    Create function:
    Parameter array of Planes
    Result: return the plane with minimal cost from all military planes (if there are some of them return first one).
     */
    public Plane minimalCostMilitaryPlane(Plane[] planes) {
        System.out.println("Task 9");

        Plane cheapest = null;
        for (Plane plane : planes) {
            if (cheapest == null) {
                if (plane.isMilitary()) {
                    cheapest = plane;
                }
                continue;
            }
            if (plane.isMilitary() && plane.getCost() < cheapest.getCost()) {
                cheapest = plane;
            }
        }
        return cheapest;
    }


    /*
    Task 10. (score 12)
    Create function:
    Parameter array of Planes
    Result: print planes in ascending form order by year
     */
    public void printAscendingByYear(Plane[] planes) {
        System.out.println("Task 10");

        for (Plane plane : planes) {
            for (int i = 1; i < planes.length; i++) {
                if (planes[i].getYear() < planes[i - 1].getYear()) {
                    Plane tmp = planes[i];
                    planes[i] = planes[i - 1];
                    planes[i - 1] = tmp;
                }
            }
        }
        for (Plane plane : planes) {
            printPlaneInfo(plane);
        }
    }


}
