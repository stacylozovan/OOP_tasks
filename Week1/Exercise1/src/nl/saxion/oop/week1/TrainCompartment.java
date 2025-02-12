package nl.saxion.oop.week1;

public class TrainCompartment {
    public int numberOfSeats;
    public int compartmentClass;
    public int numberOfSeatsInUse;

    public TrainCompartment(int numberOfSeats, int compartmentClass, int numberOfSeatsInUse) {
        this.numberOfSeats = numberOfSeats;
        this.compartmentClass = compartmentClass;
        this.numberOfSeatsInUse = numberOfSeatsInUse;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getCompartmentClass() {
        return compartmentClass;
    }

    public void setCompartmentClass(int compartmentClass) {
        this.compartmentClass = compartmentClass;
    }

    public int getNumberOfSeatsInUse() {
        return numberOfSeatsInUse;
    }

    public void setNumberOfSeatsInUse(int numberOfSeatsInUse) {
        this.numberOfSeatsInUse = numberOfSeatsInUse;
    }
}


