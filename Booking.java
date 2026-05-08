package app;

public class Booking {

    private String sessionName;
    private String date;

    public Booking(String sessionName, String date) {
        this.sessionName = sessionName;
        this.date = date;
    }

    public String getSessionName() {
        return sessionName;
    }

    public String getDate() {
        return date;
    }

    public void displayBooking() {
        System.out.println("Session: " + sessionName);
        System.out.println("Date: " + date);
    }
}