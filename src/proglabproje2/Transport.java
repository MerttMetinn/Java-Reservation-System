
package proglabproje2;

public class Transport {
    private String company;
    private String vehicle;
    private String travelInfo;
    private boolean[] seatAvailability;

    public Transport(String company, String vehicle, String travelInfo, int totalSeats) {
        this.company = company;
        this.vehicle = vehicle;
        this.travelInfo = travelInfo;
        this.seatAvailability = new boolean[totalSeats];
    }

    public String getCompany() {
        return company;
    }

    public String getVehicle() {
        return vehicle;
    }

    public String getTravelInfo() {
        return travelInfo;
    }

    public int getTotalSeats() {
        return seatAvailability.length;
    }

    public int getAvailableSeats() {
        int count = 0;
        for (boolean isAvailable : seatAvailability) {
            if (isAvailable) {
                count++;
            }
        }
        return count;
    }

    public boolean isSeatAvailable(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seatAvailability.length) {
            return seatAvailability[seatNumber - 1];
        }
        return false;
    }

    public boolean reserveSeat(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seatAvailability.length && seatAvailability[seatNumber - 1]) {
            seatAvailability[seatNumber - 1] = false;
            return true;
        }
        return false;
    }

    public boolean cancelSeatReservation(int seatNumber) {
        if (seatNumber >= 1 && seatNumber <= seatAvailability.length && !seatAvailability[seatNumber - 1]) {
            seatAvailability[seatNumber - 1] = true;
            return true;
        }
        return false;
    }
}