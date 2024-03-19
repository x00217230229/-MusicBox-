import java.util.ArrayList;  
import java.util.HashMap;  
import java.util.Scanner;  
  
public class Main {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        ArrayList<Attendee> attendees = new ArrayList<>();  
        Event event = new Event();  
  
        while (true) {  
            System.out.println("Please select an option:");  
            System.out.println("1. Add attendee");  
            System.out.println("2. Display attendees");  
            System.out.println("3. Handle complementary passes");  
            System.out.println("4. Handle performances");  
            System.out.println("5. Get seat details");  
            System.out.println("6. Exit");  
  
            int option = scanner.nextInt();  
            scanner.nextLine(); // Consume the newline left-over by nextInt()  
  
            switch (option) {  
                case 1:  
                    addAttendee(attendees);  
                    break;  
                case 2:  
                    displayAttendees(attendees);  
                    break;  
                case 3:  
                    handleComplementaryPasses(attendees, event);  
                    break;  
                case 4:  
                    handlePerformances(attendees);  
                    break;  
                case 5:  
                    getSeatDetails(event);  
                    break;  
                case 6:  
                    System.out.println("Exiting the program.");  
                    System.exit(0);  
                default:  
                    System.out.println("Invalid option. Please try again.");  
            }  
        }  
    }  
  
    private static void addAttendee(ArrayList<Attendee> attendees) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter attendee name: ");  
        String name = scanner.nextLine();  
        System.out.print("Enter attendee seat number (e.g., A1): ");  
        String seatNo = scanner.nextLine();  
  
        Attendee attendee = new Attendee(name, seatNo);  
        attendees.add(attendee);  
        System.out.println("Attendee added successfully.");  
    }  
  
    private static void displayAttendees(ArrayList<Attendee> attendees) {  
        System.out.println("Attendees:");  
        for (Attendee attendee : attendees) {  
            System.out.println(attendee);  
        }  
    }  
  
    private static void handleComplementaryPasses(ArrayList<Attendee> attendees, Event event) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter seat number for complementary pass: ");  
        String seatNo = scanner.nextLine();  
  
        Attendee attendee = new Attendee("Complementary Pass Holder", seatNo);  
        event.addAttendeeToSeat(seatNo, attendee);  
        System.out.println("Complementary pass handled successfully.");  
    }  
  
    private static void handlePerformances(ArrayList<Attendee> attendees) {  
        // Add your logic to handle performances here  
        System.out.println("Handling performances...");  
    }  
  
    private static void getSeatDetails(Event event) {  
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter seat number to get details: ");  
        String seatNo = scanner.nextLine();  
  
        Attendee attendee = event.getAttendeeBySeatNo(seatNo);  
        if (attendee != null) {  
            System.out.println("Seat details for " + seatNo + ":");  
            System.out.println(attendee);  
        } else {  
            System.out.println("No attendee found for seat number " + seatNo);  
        }  
    }  
}