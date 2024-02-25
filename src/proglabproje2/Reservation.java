
package proglabproje2;

public class Reservation {
    private String passenger;
    private String vehicle;
    private int seatNumber;

    public Reservation(String passenger, String vehicle, int seatNumber) {
        this.passenger = passenger;
        this.vehicle = vehicle;
        this.seatNumber = seatNumber;
    }

    public String getPassenger() {
        return passenger;
    }

    public String getVehicle() {
        return vehicle;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
