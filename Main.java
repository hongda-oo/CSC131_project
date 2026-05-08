package app;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Hongda", "hongda@email.com");

        Booking booking1 = new Booking(
                "Personal Training",
                "May 10"
        );

        user1.displayUser();

        System.out.println();

        booking1.displayBooking();
    }
}