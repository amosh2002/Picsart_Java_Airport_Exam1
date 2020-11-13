package model;

public class Plane {
    private String model; //name of the plane (Any not empty string)
    private String country; //country the plane belongs to (Any not empty string)
    private int year; //year of publishing  (from 1903 to 2020)
    private int hours; //hours in air (from 0 to 10000)
    private boolean isMilitary; //is military or not
    private int weight; //weight of plane (from 1000 KG to 160000 KG)
    private int wingspan; //the maximum extent across the wings of an aircraft (from 10 - 45)
    private int topSpeed; //maximal speed per hour (1000 km/h) (any not negative value)
    private int seats; //number of seats (any not negative value)
    private double cost; //cost of the plane (ex: 445.6$) (any not negative value)

    public Plane(String model, String country, int year, int hours, boolean isMilitary, int weight, int wingspan, int topSpeed, int seats, double cost) {
        setModel(model);
        setCountry(country);
        setYear(year);
        setHours(hours);
        setMilitary(isMilitary);
        setWeight(weight);
        setWingspan(wingspan);
        setTopSpeed(topSpeed);
        setSeats(seats);
        setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.length() == 0) {
            return;
        }
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() == 0) {
            return;
        }
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1903 || year > 2020) {
            return;
        }
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 10000) {
            return;
        }
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 1000 || weight > 160000) {
            return;
        }
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan < 10 || wingspan > 45) {
            return;
        }
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed < 0) {
            return;
        }
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats < 0) {
            return;
        }
        this.seats = seats;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            return;
        }
        this.cost = cost;
    }
}
